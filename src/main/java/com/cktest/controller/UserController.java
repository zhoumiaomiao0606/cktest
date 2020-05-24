package com.cktest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cktest.common.Result;
import com.cktest.pojo.User;
import com.cktest.service.UserService;

import io.swagger.annotations.Api;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 周周
 * @since 2020-05-24
 */
@RestController
@RequestMapping("/user")
@Api
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;
	@RequestMapping("/zhuche")

	public Result zhuche(String emial,String password){
		User user=new User();
		user.setEmial(emial);
		user.setPassword(password);
		Result result=new Result();
		result.setMes("注册成功");
		result.setData(password+"  "+emial);
		result.setStatu(200);
		return result;
		
	}
	

}
