package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.foril.blog.entity.ResBody;
import space.foril.blog.entity.User;
import space.foril.blog.repo.UserRepo;
import space.foril.blog.service.UserService;

import java.util.List;

@Api(tags = "用户API")
@RestController
@RequestMapping("/api")
class UserApiController {
    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("检查是否登录正确")
    @PostMapping("/login")
    public ResBody<Boolean> checklogin(@RequestBody User user){
        if(userService.checkLogin(user)){
            return new ResBody<>(true,true,"");
        } else{
            return new ResBody<>(false,false,"");
        }
    }

}
