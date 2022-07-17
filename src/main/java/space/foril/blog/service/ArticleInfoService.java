package space.foril.blog.service;

import org.springframework.stereotype.Service;
import space.foril.blog.entity.ArticleInfo;

import java.util.List;

public interface ArticleInfoService {
    ArticleInfo getArticleInfoById(Integer articleId);
    List<ArticleInfo> getArticleInfosByCateId(Integer cateId);
    List<ArticleInfo> getAllArticleInfos();
}
