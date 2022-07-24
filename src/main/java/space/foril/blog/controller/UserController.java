package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.foril.blog.entity.ResBody;
import space.foril.blog.entity.User;
import space.foril.blog.service.UserService;

import javax.servlet.http.HttpSession;

@Api(tags = "用户API")
@RestController
@CrossOrigin()
@RequestMapping("/api/user")
class UserApiController {
    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("检查是否登录正确")
    @PostMapping("/login")
    public ResBody<Boolean> checklogin(@RequestBody User user, HttpSession session){
        if(userService.checkLogin(user)){
            // 验证正确
            session.setAttribute("isLogin", true);
            return new ResBody<>(true,true,"");
        } else{
            return new ResBody<>(false,false,"");
        }
    }

}
