package space.foril.blog.repo;

import space.foril.blog.entity.Article;

import java.util.List;

public interface ArticleRepo {
    Integer insertArticle(Article article);
    Integer deleteById(Integer id);
    Integer updateArticle(Article article);
    List<Article> findAll();
    Article findById(Integer id);

    // 分页
    //public List<Article> findArticleLimit(Integer begin, Integer end);
}
