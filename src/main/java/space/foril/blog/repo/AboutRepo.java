package space.foril.blog.repo;

import space.foril.blog.entity.About;

import java.util.List;

public interface AboutRepo {
    Integer updateAbout(About about);
    About findAllAbout();
}
