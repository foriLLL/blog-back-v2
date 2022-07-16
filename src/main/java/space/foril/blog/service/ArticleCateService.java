package space.foril.blog.service;


import space.foril.blog.entity.About;
import space.foril.blog.entity.ArticleCate;

import java.util.List;

public interface ArticleCateService {
    List<ArticleCate> getAllCates();
    Boolean insertCate(ArticleCate cate);
    Boolean updateCate(ArticleCate cate);
}
