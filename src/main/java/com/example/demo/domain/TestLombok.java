package com.example.demo.domain;

import lombok.Data;

@Data
public class TestLombok {
	private String id;
	private String name;
	
	public static void main(String[] args) {
		TestLombok testLombok = new TestLombok();
		testLombok.setId("testId");
		testLombok.setName("testName");
		System.out.println(testLombok.toString());
	}
}


