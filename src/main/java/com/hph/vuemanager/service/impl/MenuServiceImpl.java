package com.hph.vuemanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hph.vuemanager.mapper.MenuMapper;
import com.hph.vuemanager.model.Menu;
import com.hph.vuemanager.service.IMenuService;
import org.springframework.stereotype.Service;

/**
 * @author hph
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
}
