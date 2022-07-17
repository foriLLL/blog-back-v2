package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.foril.blog.entity.Article;
import space.foril.blog.entity.ResBody;
import space.foril.blog.service.ArticleService;

@Api(tags = "文章API")
@RestController
@RequestMapping("/api/article")
class ArticleApiController {
    private final ArticleService articleService;

    @Autowired
    public ArticleApiController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @ApiOperation("根据文章id获取文章")
    @GetMapping("/{id}")
    public ResBody<Article> getArticleById(@PathVariable("id")Integer id){
        Article article = articleService.getArticleById(id);
        if(article==null){
            return new ResBody<>(false, null, "");
        } else{
            return new ResBody<>(true, article, "");
        }
    }
}

@Api(tags = "文章管理API")
@RestController
@RequestMapping("/api/mani/article")
class ArticleManiController {
    private final ArticleService articleService;

    @Autowired
    public ArticleManiController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @ApiOperation("新增文章")
    @PutMapping("")
    public ResBody<Boolean> insertArticle(@RequestBody Article article){
        Boolean ifSuccessful = articleService.insertArticle(article);
        return new ResBody<>(ifSuccessful, ifSuccessful, "");
    }

    @ApiOperation("修改文章")
    @PostMapping("")
    public ResBody<Boolean> updateArticle(@RequestBody Article article){
        Boolean ifSuccessful = articleService.updateArticle(article);
        return new ResBody<>(ifSuccessful, ifSuccessful, "");
    }

    @ApiOperation("删除文章")
    @DeleteMapping("/{id}")
    public ResBody<Boolean> deleteArticle(@PathVariable("id") Integer id){
        Boolean ifSuccessful = articleService.deleteArticleById(id);
        return new ResBody<>(ifSuccessful, ifSuccessful, "");
    }

}