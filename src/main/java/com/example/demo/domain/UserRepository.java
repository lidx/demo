package com.example.demo.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * 
	 * @param userName
	 * @return
	 */
    User findByUserName(String userName);
    
    /**
     * 
     * @param username
     * @param email
     * @return
     */
    List<User> findByUserNameOrEmail(String username, String email);
}
