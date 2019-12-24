package com.hph.vuemanager.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hph
 */
@RestController
@Api(tags = "vue项目相关接口")
@RequestMapping("/todo")
public class VueApiController {

    @ApiOperation("获取内容列表")
    @GetMapping("/list")
    public Object getTodoList() {
        return "";
    }

    @ApiOperation("添加内容")
    @PostMapping("/add")
    public void addTodo() {

    }

    @ApiOperation("获取内容")
    @PostMapping("/get")
    public Object getTodo() {
        return "";
    }
}
