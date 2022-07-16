package space.foril.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.foril.blog.entity.About;
import space.foril.blog.repo.AboutRepo;
import space.foril.blog.service.AboutService;

@Service
public class AboutServiceImpl implements AboutService {
    private final AboutRepo aboutRepo;

    @Autowired
    public AboutServiceImpl(AboutRepo aboutRepo) {
        this.aboutRepo = aboutRepo;
    }

    @Override
    public About getAbout() {
        return aboutRepo.findAbout();
    }

    @Override
    public Boolean updateAbout(About about) {
        return aboutRepo.updateAbout(about)==1;
    }
}
