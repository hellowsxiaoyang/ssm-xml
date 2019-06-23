package com.yzy.ssm.controller;

import com.yzy.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 杨郑耀
 * @description
 * @create 2019-06-23-20:07
 */
@Controller
public class IUserController {

	@Resource(name = "userService")
	private IUserService iUserService;

	@RequestMapping("/hello")
	public String hello(){
		return "success";
	}
}
