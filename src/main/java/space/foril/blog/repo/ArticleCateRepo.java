package space.foril.blog.repo;

import org.springframework.stereotype.Repository;
import space.foril.blog.entity.ArticleCate;

import java.util.List;

@Repository
public interface ArticleCateRepo {
    Integer insertCate(ArticleCate cate);
    Integer updateCate(ArticleCate cate);
    List<ArticleCate> findAllCates();
    ArticleCate findById(Integer cateId);
}
