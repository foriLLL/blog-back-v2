package space.foril.blog.service;

import space.foril.blog.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 检查传入的用户登录信息是否正确
     * @param user 用户信息，id和名称有任一即可
     * @return 是否验证正确
     */
    Boolean checkLogin(User user);

    //Integer insertUser(User user);
    //Integer deleteByName(String username);
    //Integer deleteById(Integer id);
    //Integer updateUser(User user);
    //User findByName(String username);
    //User findById(Integer id);
    //List<User> findAllUsers();
}
