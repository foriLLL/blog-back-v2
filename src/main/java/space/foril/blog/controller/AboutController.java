package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.foril.blog.entity.About;
import space.foril.blog.entity.ResBody;
import space.foril.blog.service.AboutService;

@Api(tags="关于信息API")
@RestController
@RequestMapping("/api/about")
class AboutApiController {
    private final AboutService aboutService;

    @Autowired
    public AboutApiController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @ApiOperation("获取关于信息")
    @GetMapping("")
    public ResBody<About> getAbout(){
        return new ResBody<>(true,aboutService.getAbout(),"");
    }
}

@Api(tags="关于管理API")
@RestController
@RequestMapping("/api/mani/about")
class AboutManiController{
    private final AboutService aboutService;

    @Autowired
    public AboutManiController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @ApiOperation("设置关于")
    @PostMapping("")
    public ResBody<Boolean> updateAbout(@RequestBody About about){
        Boolean ifSuccessful = aboutService.updateAbout(about);
        return new ResBody<>(ifSuccessful, ifSuccessful, "");
    }
}

