package com.example.demo.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {
		
//		userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456"));
//		userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456"));
//		userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456"));

		Assert.assertEquals("cc123456", userRepository.findByUserNameOrEmail("cc3", "cc@126.com").get(0).getNickName());
//		userRepository.delete(userRepository.findByUserName("aa1"));
	}
	
	@Test
	public void testBaseQuery() throws Exception {
		User user=new User();
		userRepository.findAll();
		userRepository.getOne(1l);
		userRepository.save(user);
		userRepository.delete(user);
		userRepository.count();
		userRepository.existsById(1l);
	}
	
//	@Test
//	public void testPageQuery() throws Exception {
//		int page=1,size=10;
//		Sort sort = new Sort(Direction.DESC, "id");
//	    Pageable pageable = new PageRequest(page, size, sort);
//	    userRepository.findALL(pageable);
//	    userRepository.findByUserName("testName", pageable);
//	}

}