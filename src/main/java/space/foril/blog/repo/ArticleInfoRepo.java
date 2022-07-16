package space.foril.blog.repo;

import org.springframework.stereotype.Repository;
import space.foril.blog.entity.Article;
import space.foril.blog.entity.ArticleInfo;

import java.util.List;

@Repository
public interface ArticleInfoRepo {
    List<ArticleInfo> getAllArticleInfos();
    List<ArticleInfo> getAllArticleInfosByCateId(Integer cateId);
    ArticleInfo getArticleInfoByArticleId(Integer articleId);

    // 分页

}
