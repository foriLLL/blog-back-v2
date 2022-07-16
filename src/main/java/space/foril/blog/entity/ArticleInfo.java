package space.foril.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleInfo {
    private Integer articleId;
    private String title;
    private Integer cateId;
    private String cateName;
    private Date time;
    private Integer views;
    private String coverImg;
    private String description;
    private Integer userId;
    private String userName;
}
