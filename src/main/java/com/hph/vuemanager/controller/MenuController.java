package com.hph.vuemanager.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hph.vuemanager.model.Menu;
import com.hph.vuemanager.service.IMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 菜单controller
 * @author hph
 */
@RestController
@Api(tags = "菜单相接口")
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @ApiOperation("获取菜单列表")
    @GetMapping("/list")
    public Object getMenuList() {

        return menuService.list().
                stream().
                sorted(Comparator.comparing(Menu::getId)).
                collect(Collectors.toList());
    }

    @ApiOperation("获取菜单")
    @GetMapping("/{id}")
    public Object getMenu(@PathVariable String id) {

        return menuService.getById(id);
    }

    @ApiOperation("添加菜单")
    @PostMapping("/add")
    public void addMenu(Menu menu) {

        menuService.save(menu);
    }

    @ApiOperation("删除菜单")
    @DeleteMapping("/delete/{id}")
    public void deleteMenu(@PathVariable String id) {

        menuService.update(new UpdateWrapper<Menu>()
                .eq("id", id)
                .set("is_delete", "1"));
    }

    @ApiOperation("修改菜单")
    @PutMapping("/update")
    public void updateMenu(@RequestBody Menu menu) {

        menuService.update(new UpdateWrapper<>(menu));
    }
}
