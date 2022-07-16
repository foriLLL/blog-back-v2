package space.foril.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.User;
import space.foril.blog.service.impl.UserServiceImpl;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {
    @Resource
    UserService userService;

    @Test
    public void checkLoginTest(){
        User user = new User(null, "foril", "WCX990824wcx");
        System.out.println(userService.checkLogin(user));
    }
}
