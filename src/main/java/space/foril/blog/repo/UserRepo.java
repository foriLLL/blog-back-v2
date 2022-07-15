package space.foril.blog.repo;

import org.springframework.stereotype.Repository;
import space.foril.blog.entity.User;

import java.util.List;

@Repository
public interface UserRepo {
    Integer insertUser(User user);
    Integer deleteByName(String username);
    Integer deleteById(Integer id);
    Integer updateUser(User user);
    User findByName(String username);
    User findById(Integer id);
    List<User> findAllUsers();
}
