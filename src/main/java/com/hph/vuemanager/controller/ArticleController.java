package com.hph.vuemanager.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hph.vuemanager.model.Article;
import com.hph.vuemanager.service.IArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 内容controller
 * @author hph
 */
@RestController
@Api(tags = "内容相关接口")
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @ApiOperation("新增内容")
    @PostMapping("/add")
    public void addArticle(@RequestBody Article article) {

        articleService.save(article);
    }

    @ApiOperation("删除内容")
    @DeleteMapping("/delete/{id}")
    public void deleteArticle(@PathVariable String id) {

        articleService.update(new UpdateWrapper<Article>()
                .eq("id", id)
                .set("is_delete", "1"));
    }

    @ApiOperation("修改内容")
    @PutMapping("/update")
    public void updateMenu(@RequestBody Article article) {

        articleService.update(new UpdateWrapper<>(article));
    }

    @ApiOperation("获取内容列表")
    @GetMapping("/list")
    public Object getArticleList() {

        return articleService.list().
                stream().
                sorted(Comparator.comparing(Article::getId)).
                collect(Collectors.toList());
    }
}
