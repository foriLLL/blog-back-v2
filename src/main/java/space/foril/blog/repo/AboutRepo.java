package space.foril.blog.repo;

import org.springframework.stereotype.Repository;
import space.foril.blog.entity.About;

import java.util.List;
@Repository
public interface AboutRepo {
    Integer updateAbout(About about);
    About findAbout();
}
