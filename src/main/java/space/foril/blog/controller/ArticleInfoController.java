package space.foril.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.foril.blog.entity.ArticleInfo;
import space.foril.blog.entity.ResBody;
import space.foril.blog.service.ArticleInfoService;

import java.util.List;

@Api(tags = "文章信息API")
@RestController
@CrossOrigin()
@RequestMapping("/api/articleInfo")
class ArticleInfoApiController {
    private final ArticleInfoService articleInfoService;

    @Autowired
    public ArticleInfoApiController(ArticleInfoService articleInfoService) {
        this.articleInfoService = articleInfoService;
    }

    @ApiOperation("根据文章id获取文章信息")
    @GetMapping("/articleId/{id}")
    public ResBody<ArticleInfo> getArticleInfoById(@PathVariable("id") Integer articleId) {
        ArticleInfo articleInfo = articleInfoService.getArticleInfoById(articleId);
        if (articleInfo != null) {
            return new ResBody<>(true, articleInfo, "");
        } else {
            return new ResBody<>(false, null, "failed");
        }
    }

    @ApiOperation("根据类别id获取对应类别所有文章信息")
    @GetMapping("/cateId/{id}")
    public ResBody<List<ArticleInfo>> getArticleInfosByCateId(@PathVariable("id") Integer articleId) {
        List<ArticleInfo> articleInfos = articleInfoService.getArticleInfosByCateId(articleId);
        if (articleInfos != null) {
            return new ResBody<>(true, articleInfos, "");
        } else {
            return new ResBody<>(false, null, "failed");
        }
    }

    @ApiOperation("获取所有文章信息")
    @GetMapping("")
    public ResBody<List<ArticleInfo>> getArticleInfos() {
        List<ArticleInfo> articleInfos = articleInfoService.getAllArticleInfos();
        if (articleInfos != null) {
            return new ResBody<>(true, articleInfos, "");
        } else {
            return new ResBody<>(false, null, "failed");
        }
    }
}
