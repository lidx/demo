package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.User;

public interface UserMapper {
	
	@Select("SELECT * FROM user")
	@Results({
		@Result(property = "userName",  column = "USERNAME"),
		@Result(property = "nickName", column = "NICKNAME")
	})
	List<User> getAll();
	
	@Select("SELECT * FROM user WHERE id = #{id}")
	@Results({
		@Result(property = "userName",  column = "USERNAME"),
		@Result(property = "nickName", column = "NICKNAME")
	})
	User getOne(Long id);

	@Insert("INSERT INTO user(userName,passWord) VALUES(#{userName}, #{passWord})")
	void insert(User user);

	@Update("UPDATE user SET userName=#{userName},nickName=#{nickName} WHERE id =#{id}")
	void update(User user);

	@Delete("DELETE FROM user WHERE id =#{id}")
	void delete(Long id);
	
	//如果使用xml来进行mybatis的SQL配置，方法定义如下就可以
//	List<User> getAll();
//	
//	User getOne(Long id);
//
//	void insert(User user);
//
//	void update(User user);
//
//	void delete(Long id);

}
