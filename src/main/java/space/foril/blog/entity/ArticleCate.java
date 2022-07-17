package space.foril.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleCate {
    private Integer cateId;
    private String cateName;

    public ArticleCate(String cateName) {
        this.cateName = cateName;
    }
}
