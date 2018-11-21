package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;

import io.swagger.annotations.ApiOperation;

/**
 * 测试从缓存中获取数据
 * @author 86187
 *
 */
@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@ApiOperation(value="测试从缓存中获取数据", notes="测试从缓存中获取数据")
	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
	@Cacheable(value="user-key")
	public User getUser() {
	    User user = userRepository.findByUserName("bb2");
	    System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
	    return user;
	}
}
