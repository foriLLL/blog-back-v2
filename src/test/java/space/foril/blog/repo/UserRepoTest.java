package space.foril.blog.repo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.foril.blog.entity.User;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepoTest {
    @Resource
    private UserRepo userRepo;

    @Test
    public void insertTest(){
        try {
            System.out.println(userRepo.insertUser(new User("testByJUnit", "password")));
        } catch (DuplicateKeyException e){
            System.out.println("-".repeat(20));
            System.out.println(e.getCause().getMessage());
        }
    }

    @Test
    public void deleteByNameTest(){
        System.out.println(userRepo.deleteByName("testByJUnit"));
    }

    @Test
    public void deleteByIdTest(){
        System.out.println(userRepo.deleteById(8));
    }

    @Test
    public void updateUserTest(){
        System.out.println(userRepo.updateUser(new User(5, "changedName", "newpassword")));
    }

    @Test
    public void selectTest(){
        System.out.println(userRepo.findAllUsers());
        System.out.println(userRepo.findById(1));
        System.out.println(userRepo.findByName("changedName"));
    }



}
