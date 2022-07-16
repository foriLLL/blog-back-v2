package space.foril.blog.service;


import space.foril.blog.entity.About;

public interface AboutService {
    About getAbout();
    Boolean updateAbout(About about);
}
