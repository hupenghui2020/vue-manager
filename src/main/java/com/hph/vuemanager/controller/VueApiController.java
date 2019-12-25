package com.hph.vuemanager.controller;

import com.hph.vuemanager.model.MenuBar;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hph
 */
@RestController
@Api(tags = "vue项目相关接口")
@RequestMapping("/todo")
public class VueApiController {

    @ApiOperation("获取左边菜单列表")
    @GetMapping("/list")
    public Object getTodoList() {

        List<MenuBar> menuBarList = new ArrayList<>();

        MenuBar menuBar = new MenuBar();

        menuBar.setId("1");

        menuBar.setCount(0);

        menuBar.setLocked(false);

        menuBar.setTitle("测试");

        menuBarList.add(menuBar);
        return menuBarList;
    }

    @ApiOperation("添加内容")
    @PostMapping("/add")
    public Object addTodo() {
        return "sssssddddd";
    }

    @ApiOperation("获取内容")
    @PostMapping("/get")
    public Object getTodo() {
        return "";
    }

    @ApiOperation("获取内容")
    @PostMapping("/record/add")
    public Object addRecord() {
        return "";
    }
}
