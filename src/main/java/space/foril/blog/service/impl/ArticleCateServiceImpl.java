package space.foril.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import space.foril.blog.entity.ArticleCate;
import space.foril.blog.repo.ArticleCateRepo;
import space.foril.blog.service.ArticleCateService;

import java.util.List;

@Service
public class ArticleCateServiceImpl implements ArticleCateService {
    private final ArticleCateRepo articleCateRepo;

    @Autowired
    public ArticleCateServiceImpl(ArticleCateRepo articleCateRepo) {
        this.articleCateRepo = articleCateRepo;
    }

    @Override
    public List<ArticleCate> getAllCates() {
        return articleCateRepo.findAllCates();
    }

    @Override
    public Boolean insertCate(ArticleCate cate) {
        return articleCateRepo.insertCate(cate)==1;
    }

    @Override
    public Boolean updateCate(ArticleCate cate) {
        return articleCateRepo.updateCate(cate)==1;
    }
}
