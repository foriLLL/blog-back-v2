package space.foril.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.About;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AboutServiceImplTest {
    @Resource
    private AboutService aboutService;
    @Test
    public void getAboutTest(){
        System.out.println(aboutService.getAbout());
    }

    @Test
    public void updateAboutTest(){
        System.out.println(aboutService.updateAbout(new About("new about")));
    }
}
