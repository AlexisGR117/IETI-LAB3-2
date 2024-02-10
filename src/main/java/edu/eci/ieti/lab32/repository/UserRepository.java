package edu.eci.ieti.lab32.repository;

import edu.eci.ieti.lab32.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
