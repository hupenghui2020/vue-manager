package com.hph.vuemanager.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hph.vuemanager.model.Article;
import com.hph.vuemanager.model.MenuBar;
import com.hph.vuemanager.service.IMenuBarService;
import com.hph.vuemanager.vo.ItemVo;
import com.hph.vuemanager.vo.RecordItemVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hph
 */
@RestController
@Api(tags = "vue项目相关接口")
@RequestMapping("/todo")
public class VueApiController {

    /**
     * 菜单
     */
    private List<MenuBar> menuBarList = new ArrayList<>();

    /**
     * 内容
     */
    private Map<String,RecordItemVo> recordItemVoMap = new HashMap<>();

    private int num = 0;

    @Autowired
    private IMenuBarService menuBarService;

    @ApiOperation("获取菜单列表")
    @GetMapping("/list")
    public Object getTodoList() {

        return menuBarService.list().
                stream().
                sorted(Comparator.comparing(MenuBar::getId)).
                collect(Collectors.toList());
    }

    @ApiOperation("添加菜单")
    @PostMapping("/add")
    public void addTodo() {
        MenuBar menuBar = new MenuBar();

        String id = String.valueOf(++num);

        menuBar.setId(id);

        menuBar.setCount(0);

        menuBar.setLocked(false);

        menuBar.setTitle("测试" + num);

        menuBarList.add(menuBar);

        RecordItemVo recordItemVo = new RecordItemVo();

        recordItemVo.setMenuBar(menuBar);

        recordItemVo.setArticleList(new ArrayList<>());

        recordItemVoMap.put(id, recordItemVo);
    }

    @ApiOperation("新增内容")
    @PostMapping("/record/add")
    public void addRecord(@RequestBody ItemVo itemVo) {

        Article article = new Article();

        article.setIsDelete(false);

        article.setChecked(false);

        article.setTitle(itemVo.getTitle());

        article.setId(UUID.randomUUID().toString());

        RecordItemVo recordItemVo = recordItemVoMap.get(itemVo.getMenuId());

        recordItemVo.getArticleList().add(article);

        MenuBar menuBar = recordItemVo.getMenuBar();

        menuBar.setCount(menuBar.getCount() + 1);
    }

    @ApiOperation("获取内容")
    @GetMapping("/{id}")
    public Object getTodo(@PathVariable String id) {

        return recordItemVoMap.get(id);
    }
}
