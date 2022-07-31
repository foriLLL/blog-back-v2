package space.foril.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.Article;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleServiceImplTest {
    @Resource
    private ArticleService articleService;

    @Test
    public void getByIdTest(){
        System.out.println(articleService.getArticleById(21).getTitle());
    }

    @Test
    public void insertTest(){
        Article article = new Article("new article title", 1, new Date(), null, "content", null, "des", 1);
        System.out.println(articleService.insertArticle(article));
    }

    @Test
    public void updateTest(){
        Article artitle = new Article(247,"renewed article title", 2, new Date(), null, "content111", null, "des", 1);
        System.out.println(articleService.updateArticle(artitle));
    }

    @Test
    public void deleteTest(){
        System.out.println(articleService.deleteArticleById(247));
    }

}
