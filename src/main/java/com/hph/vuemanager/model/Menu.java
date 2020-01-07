package com.hph.vuemanager.model;

import lombok.Data;

/**
 * @author hph
 * 菜单栏
 */

@Data
public class Menu {

    private int id;

    private String title;

    private int locked;

    private int count;

    private int isDelete;
}
