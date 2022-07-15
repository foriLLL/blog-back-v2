package space.foril.blog.repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.Article;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleRepoTest {
    @Resource
    private ArticleRepo articleRepo;

    @Test
    public void insertTest(){
        Article article = new Article("title", 1, new Date(), null, "content", null, "desc", 1);
        System.out.println(articleRepo.insertArticle(article));
    }

    @Test
    public void deleteTest(){
        System.out.println(articleRepo.deleteById(245));
    }

    @Test
    public void updateTest(){
        Article article = new Article(246, "changedTitle", 2, null, null, "new content", null, "new desc", 1);
        System.out.println(articleRepo.updateArticle(article));
    }

    @Test
    public void selectAllTest(){
        articleRepo.findAll().forEach(article ->
                System.out.println(article.getTitle()));
    }

    @Test
    public void selectByIdTest(){
        System.out.println(articleRepo.findById(240).getTime());
    }
}
