package space.foril.blog.repo;

import org.springframework.stereotype.Repository;
import space.foril.blog.entity.User;

import java.util.List;

@Repository
public interface UserRepo {
    List<User> findAll();
    Integer getUserNumber();
    User findById(Integer userId);
    User findByName(String name);
}
