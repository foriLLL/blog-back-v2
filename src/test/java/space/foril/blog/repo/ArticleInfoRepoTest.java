package space.foril.blog.repo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleInfoRepoTest {

    @Resource
    ArticleInfoRepo articleInfoRepo;

    @Test
    public void selectTest(){
        //System.out.println(articleInfoRepo.getArticleInfoByArticleId(13));
        //articleInfoRepo.getAllArticleInfos().forEach(System.out::println);
        articleInfoRepo.getAllArticleInfosByCateId(2).forEach(System.out::println);
    }

}
