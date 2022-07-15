package space.foril.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleCate {
    private Integer cateId;
    private String cateName;

    public ArticleCate(String cateName) {
        this.cateName = cateName;
    }
}
