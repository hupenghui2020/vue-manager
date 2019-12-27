package com.hph.vuemanager.model;

import lombok.Data;

/**
 * 内容条目
 * @author hph
 */
@Data
public class Article {

    private String id;

    private Boolean checked;

    private String title;

    private Boolean isDelete;
}
