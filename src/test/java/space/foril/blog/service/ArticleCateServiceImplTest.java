package space.foril.blog.service;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.ArticleCate;
import space.foril.blog.service.impl.ArticleCateServiceImpl;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleCateServiceImplTest {
    @Resource
    ArticleCateService articleCateService;

    @Test
    public void getCateTest(){
        System.out.println(articleCateService.getAllCates());
    }
    @Test
    public void insertCateTest(){
        System.out.println(articleCateService.insertCate(new ArticleCate("test")));
    }

    @Test
    public void updateCateTest(){
        System.out.println(articleCateService.updateCate(new ArticleCate(6, "newName")));
    }
}
