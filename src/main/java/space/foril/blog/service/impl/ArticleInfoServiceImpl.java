package space.foril.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.foril.blog.entity.ArticleInfo;
import space.foril.blog.repo.ArticleInfoRepo;
import space.foril.blog.service.ArticleInfoService;

import java.util.List;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService {
    private final ArticleInfoRepo articleInfoRepo;

    @Autowired
    public ArticleInfoServiceImpl(ArticleInfoRepo articleInfoRepo) {
        this.articleInfoRepo = articleInfoRepo;
    }

    @Override
    public ArticleInfo getArticleInfoById(Integer articleId) {
        return articleInfoRepo.getArticleInfoByArticleId(articleId);
    }

    @Override
    public List<ArticleInfo> getArticleInfosByCateId(Integer cateId) {
        return articleInfoRepo.getAllArticleInfosByCateId(cateId);
    }

    @Override
    public List<ArticleInfo> getAllArticleInfos() {
        return articleInfoRepo.getAllArticleInfos();
    }
}
