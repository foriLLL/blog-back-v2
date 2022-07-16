package space.foril.blog.repo;

import io.swagger.models.auth.In;
import org.springframework.stereotype.Repository;
import space.foril.blog.entity.Article;

import java.util.List;

@Repository
public interface ArticleRepo {
    Integer insertArticle(Article article);
    Integer deleteById(Integer id);
    Integer updateArticle(Article article);
    List<Article> findAll();
    Article findById(Integer id);
    List<Article> findByCateId(Integer cateId);
    // 分页
    //public List<Article> findArticleLimit(Integer begin, Integer end);
}
