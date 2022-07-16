package space.foril.blog.service;

import space.foril.blog.entity.User;

public interface UserService {
    /**
     * 检查传入的用户登录信息是否正确
     * @param user 用户信息，id和名称有任一即可
     * @return 是否验证正确
     */
    Boolean checkLogin(User user);
}
