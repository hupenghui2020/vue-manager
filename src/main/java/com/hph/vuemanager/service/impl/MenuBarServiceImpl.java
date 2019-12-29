package com.hph.vuemanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hph.vuemanager.mapper.MenuBarMapper;
import com.hph.vuemanager.model.MenuBar;
import com.hph.vuemanager.service.IMenuBarService;
import org.springframework.stereotype.Service;

/**
 * @author hph
 */
@Service
public class MenuBarServiceImpl extends ServiceImpl<MenuBarMapper, MenuBar> implements IMenuBarService{
}
