package space.foril.blog.repo;

import space.foril.blog.entity.ArticleCate;

import java.util.List;

public interface ArticleCateRepo {
    Integer insertCate(ArticleCate cate);
    Integer updateCate(ArticleCate cate);
    List<ArticleCate> findAllCates();
    ArticleCate findById(Integer cateId);
}
