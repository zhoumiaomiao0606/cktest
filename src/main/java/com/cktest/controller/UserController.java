package com.cktest.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
	@PostMapping("/zhuche")

	public Result zhuche(String username,String password){
		User user=new User();
		user.setEmial(username);
		user.setPassword(password);
		user.setRegistertime(new Date());
		
		userService.save(user);
		
		Result result=new Result();
		result.setMes("注册成功");
		result.setData(password+"  "+username);
		result.setStatu(200);
		return result;
		
	}
	
	@PostMapping("/yanchong")
	public Result yanchong(String username){
		
		QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
		queryWrapper.eq("emial", username);
	    User user=	userService.getOne(queryWrapper);
	    if(user==null){

			Result result=new Result();
			result.setMes("密码没有重复");
			result.setData("密码米有重复");
			result.setStatu(200);
			return result;
	    }
	    else{
	    	Result result=new Result();
			result.setMes("账号已存在，请重新输入");
			result.setStatu(0);
			return result;
	    }
		
		
		
	}
}
