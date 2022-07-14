package space.foril.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import space.foril.blog.entity.User;
import space.foril.blog.repo.UserRepo;

import java.util.List;

@RestController
public class UserHandler {
    @Autowired
    public UserHandler(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    private final UserRepo userRepo;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepo.findAll();
    }

    @GetMapping("/count")
    public Integer count(){
        return userRepo.getUserNumber();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepo.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public User findByName(@PathVariable("name") String name){
        return userRepo.findByName(name);
    }
}
