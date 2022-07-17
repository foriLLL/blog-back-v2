package space.foril.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.About;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleInfoServiceImplTest {
    @Resource
    private ArticleInfoService articleInfoService;

    @Test
    public void getArticleInfoByIdTest(){
        System.out.println(articleInfoService.getArticleInfoById(10));
    }

    @Test
    public void getArticleInfosByCateIdTest(){
        System.out.println(articleInfoService.getArticleInfosByCateId(2));
    }

    @Test
    public void getAllArticleInfosTest(){
        System.out.println(articleInfoService.getAllArticleInfos());
    }
}
