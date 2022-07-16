package space.foril.blog.repo;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.About;
import space.foril.blog.entity.User;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AboutRepoTest {
    @Resource
    private AboutRepo aboutRepo;

    @Test
    public void updateTest(){
        System.out.println(aboutRepo.updateAbout(new About("contenttt")));
    }
    @Test
    public void selectTest(){
        System.out.println(aboutRepo.findAbout().getContent());
    }
}
