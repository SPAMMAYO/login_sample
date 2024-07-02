package ac.su.kdt.login_sample;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    List<Admin> findByUsername(String adminName);
}
