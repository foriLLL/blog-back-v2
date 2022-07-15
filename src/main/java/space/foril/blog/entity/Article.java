package space.foril.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Integer articleId;
    private String title;
    private Integer cateId;
    private Date time;
    private Integer views;
    private String content;
    private String coverImg;
    private String description;
    private Integer userId;

    public Article(String title, Integer cateId, Date time, Integer views, String content, String coverImg, String description, Integer userId) {
        this.title = title;
        this.cateId = cateId;
        this.time = time;
        this.views = views;
        this.content = content;
        this.coverImg = coverImg;
        this.description = description;
        this.userId = userId;
    }
}
