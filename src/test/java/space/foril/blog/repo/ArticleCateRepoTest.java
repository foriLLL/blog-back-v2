package space.foril.blog.repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.ArticleCate;

import javax.annotation.Resource;
import javax.xml.catalog.Catalog;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleCateRepoTest {
    @Resource
    private ArticleCateRepo articleCateRepo;

    @Test
    public void insertCateTest(){
        System.out.println(articleCateRepo.insertCate(new ArticleCate("tmptest")));
    }

    @Test
    public void updateCateTest(){
        System.out.println(articleCateRepo.updateCate(new ArticleCate(4, "testRenamed")));
    }

    @Test
    public void selectTest(){
        System.out.println(articleCateRepo.findAllCates());
        System.out.println(articleCateRepo.findById(1));
    }
}
