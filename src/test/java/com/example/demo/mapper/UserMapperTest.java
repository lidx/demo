package com.example.demo.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.User;

@RunWith(SpringRunner.class)
@MapperScan("com.example.demo.mapper")
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper UserMapper;

//	@Test
//	public void testInsert() throws Exception {
//		UserMapper.insert(new User("aa", "a123456","aa", "a123456"));
//		UserMapper.insert(new User("bb", "b123456","aa", "a123456"));
//		UserMapper.insert(new User("cc", "b123456","aa", "a123456"));
//
//		Assert.assertEquals(3, UserMapper.getAll().size());
//	}

	@Test
	public void testQuery() throws Exception {
		List<User> users = UserMapper.getAll();
		System.out.println(users.toString());
	}
	
	@Test
	public void testUpdate() throws Exception {
		User user = UserMapper.getOne(26l);
		System.out.println(user.toString());
		user.setNickName("neo");
		UserMapper.update(user);
		Assert.assertTrue(("neo".equals(UserMapper.getOne(26l).getNickName())));
	}
}
