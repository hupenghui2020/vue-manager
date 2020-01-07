package com.hph.vuemanager.vo;

import com.hph.vuemanager.model.Article;
import lombok.Data;

/**
 * 添加内容参数VO
 * @author hph
 */

@Data
public class ItemVo {

    private String menuId;

    private Article article;
}
