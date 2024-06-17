package epsi.arosajeback.repository;

import epsi.arosajeback.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}