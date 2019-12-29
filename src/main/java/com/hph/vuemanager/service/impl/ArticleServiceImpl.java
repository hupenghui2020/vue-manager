package com.hph.vuemanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hph.vuemanager.mapper.ArticleMapper;
import com.hph.vuemanager.model.Article;
import com.hph.vuemanager.service.IArticleService;
import org.springframework.stereotype.Service;

/**
 * @author hph
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService{


}
