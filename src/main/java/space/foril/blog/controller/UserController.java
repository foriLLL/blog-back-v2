package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import space.foril.blog.entity.User;
import space.foril.blog.repo.UserRepo;

import java.util.List;

@Api(tags = "用户管理")
@RestController
public class UserController {
    //@Autowired
    //public UserController(UserRepo userRepo) {
    //    this.userRepo = userRepo;
    //}

    //private final UserRepo userRepo;

    //@ApiOperation(value = "获取所有用户")
    //@GetMapping("/findAll")
    //public List<User> findAll(){
    //    return userRepo.findAll();
    //}
    //
    //@GetMapping("/count")
    //public Integer count(){
    //    return userRepo.getUserNumber();
    //}
    //
    //@GetMapping("/findById/{id}")
    //public User findById(@PathVariable("id") Integer id){
    //    return userRepo.findById(id);
    //}
    //
    //@GetMapping("/findByName/{name}")
    //public User findByName(@PathVariable("name") String name){
    //    return userRepo.findByName(name);
    //}
}
