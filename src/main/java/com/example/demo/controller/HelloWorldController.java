package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * 测试helloworld
 * @author 86187
 *
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ApiOperation(value="测试helloworld", notes="")
    public String index() {
        return "Hello World";
    }
	
	
}