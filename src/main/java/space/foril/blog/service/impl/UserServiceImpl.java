package space.foril.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import space.foril.blog.entity.User;
import space.foril.blog.repo.UserRepo;
import space.foril.blog.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    public UserServiceImpl(@Autowired UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Boolean checkLogin(User user) {
        User actualUser;
        if (user.getUserId() != null) {
            actualUser = userRepo.findById(user.getUserId());
        } else if (user.getUserName() != null) {
            actualUser = userRepo.findByName(user.getUserName());
        } else{
            return false;
        }
        if(actualUser==null) return false;
        return user.getPassword().equals(actualUser.getPassword());
    }
}
