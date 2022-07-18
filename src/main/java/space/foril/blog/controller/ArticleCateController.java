package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.foril.blog.entity.ArticleCate;
import space.foril.blog.entity.ResBody;
import space.foril.blog.service.ArticleCateService;

import java.util.List;

@Api(tags = "文章类别API")
@RestController
@RequestMapping("/api/articleCate")
class ArticleCateApiController {
    private final ArticleCateService articleCateService;


    @Autowired
    public ArticleCateApiController(ArticleCateService articleCateService) {
        this.articleCateService = articleCateService;
    }

    @ApiOperation("获取所有文章类别")
    @GetMapping("")
    public ResBody<List<ArticleCate>> getAllCates(){
        return new ResBody<>(true, articleCateService.getAllCates(), "");
    }
}

@Api(tags = "文章类别管理API")
@RestController
@RequestMapping("/api/mani/articleCate")
class ArticleCateManiController{
    private final ArticleCateService articleCateService;

    @Autowired
    public ArticleCateManiController(ArticleCateService articleCateService) {
        this.articleCateService = articleCateService;
    }
    @ApiOperation("新增文章类别")
    @PutMapping("")
    public ResBody<Boolean> insertCate(@RequestBody ArticleCate articleCate){
        Boolean ifSuccessful = articleCateService.insertCate(articleCate);
        return new ResBody<>(ifSuccessful, ifSuccessful, "");
    }
    @ApiOperation("修改文章类别")
    @PostMapping("")
    public ResBody<Boolean> updateCate(@RequestBody ArticleCate articleCate){
        Boolean ifSuccessful = articleCateService.updateCate(articleCate);
        return new ResBody<>(ifSuccessful, ifSuccessful, "");
    }


}
