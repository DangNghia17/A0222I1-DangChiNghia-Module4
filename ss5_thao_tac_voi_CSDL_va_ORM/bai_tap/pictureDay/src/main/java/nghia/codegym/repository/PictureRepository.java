package nghia.codegym.repository;

import nghia.codegym.model.Feedback;
import nghia.codegym.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture,Integer> {
}
