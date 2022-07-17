package space.foril.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResBody<T> {
    private Boolean ifSuccessful;
    private T data;
    private String message;
}
