package com.hph.vuemanager.model;

import lombok.Data;

/**
 * @author hph
 * 菜单栏
 */

@Data
public class MenuBar {

    private String id;

    private String title;

    private Boolean locked;

    private Integer count;
}
