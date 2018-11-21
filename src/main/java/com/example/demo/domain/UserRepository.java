package com.example.demo.domain;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


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
    
    void deleteById(Long id);

    Long countByUserName(String userName);
    
    List<User> findByEmailLike(String email);

    User findByUserNameIgnoreCase(String userName);
        
    List<User> findByUserNameOrderByEmailDesc(String userName);
    
//    Page<User> findALL(Pageable pageable);
    
//    Page<User> findByUserName(String userName,Pageable pageable);
    
    
    @Modifying
    @Query("update User u set u.userName = ?1 where u.id = ?2")
    int modifyByIdAndUserId(String  userName, Long id);
    	
    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    void deleteByUserId(Long id);
      
    @Transactional(timeout = 10)
    @Query("select u from User u where u.email = ?1")
        User findByEmailAddress(String emailAddress);
}
