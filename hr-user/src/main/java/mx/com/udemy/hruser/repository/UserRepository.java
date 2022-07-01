package mx.com.udemy.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.udemy.hruser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
