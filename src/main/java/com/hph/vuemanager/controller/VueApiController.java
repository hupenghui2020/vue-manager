package com.hph.vuemanager.controller;

import com.hph.vuemanager.model.Article;
import com.hph.vuemanager.model.MenuBar;
import com.hph.vuemanager.vo.RecordItemVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
    List<MenuBar> menuBarList = new ArrayList<>();

    /**
     * 内容
     */
    Map<String,RecordItemVo> recordItemVoMap = new HashMap<>();

    private int num = 0;

    @ApiOperation("获取菜单列表")
    @GetMapping("/list")
    public Object getTodoList() {

        return menuBarList;
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



        recordItemVoMap.put(id, )
    }

    @ApiOperation("新增内容")
    @PostMapping("/record/add")
    public void addRecord(@RequestParam(name = "id") String menuId,
                          @RequestParam(name = "text") String title) {

        Article article = new Article();

        article.setTitle(title);

        article.setIsDelete(false);

        article.setChecked(false);

        article.setId(UUID.randomUUID().toString());

        RecordItemVo recordItemVo = recordItemVoMap.get(menuId);

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
