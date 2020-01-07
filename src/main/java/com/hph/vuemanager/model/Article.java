package com.hph.vuemanager.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 内容条目
 * @author hph
 */
@Data
@ApiModel(description = "")
public class Article implements Serializable {

    private int id;

    private int checked;

    private String title;

    private int isDelete;

    private int menuId;
}
