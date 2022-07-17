package space.foril.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.foril.blog.entity.Article;
import space.foril.blog.repo.ArticleRepo;
import space.foril.blog.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepo articleRepo;

    @Autowired
    public ArticleServiceImpl(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleRepo.findById(id);
    }

    @Override
    public Boolean insertArticle(Article article) {
        return articleRepo.insertArticle(article)==1;
    }

    @Override
    public Boolean updateArticle(Article article) {
        return articleRepo.updateArticle(article)==1;
    }

    @Override
    public Boolean deleteArticleById(Integer id) {
        return articleRepo.deleteById(id)==1;
    }
}
