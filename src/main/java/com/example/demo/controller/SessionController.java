package com.example.demo.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 获取共享的sessionId
 * @author 86187
 *
 */
@RestController
public class SessionController {
	
	@RequestMapping(value = "/{uid}/test",method = RequestMethod.GET)
	@ApiOperation(value="获取共享的sessionId", notes="根据url的id来获取共享的sessionId")
	@ApiImplicitParam(name = "uid", value = "用户ID", required = true, dataType = "String")
    String uid(@PathVariable String uid,HttpSession session) {
        UUID uuid = (UUID) session.getAttribute("uid");
        if (uuid == null) {
        	uuid = UUID.randomUUID();
        }
        session.setAttribute("uid", uuid);
        return session.getId();
    }
}
