package com.greenhorn.spring_boot_demo2.service;

import java.util.List;

import com.greenhorn.spring_boot_demo2.entity.Article;

public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
