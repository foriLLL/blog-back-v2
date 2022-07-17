package space.foril.blog.service;

import space.foril.blog.entity.Article;

public interface ArticleService {
    Article getArticleById(Integer id);
    Boolean insertArticle(Article article);
    Boolean updateArticle(Article article);
    Boolean deleteArticleById(Integer id);
}
