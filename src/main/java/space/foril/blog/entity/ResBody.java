package space.foril.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResBody<T> {
    private Boolean ifSuccessful;
    private T data;
    private String message;
}
