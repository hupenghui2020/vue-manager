package com.hph.vuemanager.vo;

import com.hph.vuemanager.model.Article;
import com.hph.vuemanager.model.MenuBar;
import lombok.Data;

import java.util.List;

/**
 * 右边显示的内容
 * @author hph
 */
@Data
public class RecordItemVo {

    private MenuBar menuBar;

    private List<Article> articleList;
}
