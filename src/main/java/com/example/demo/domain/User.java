package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String passWord;
	@Column(name="email")
	private String email;
	@Column(name="nickname")
	private String nickName;
//	@Column(name="regtime")
//	private String regTime;
	
	
	public User() {
		super();
	}
	
	public User(String userName, String passWord, String email, String nickName) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.nickName = nickName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
//	public String getRegTime() {
//		return regTime;
//	}
//	public void setRegTime(String regTime) {
//		this.regTime = regTime;
//	}
}