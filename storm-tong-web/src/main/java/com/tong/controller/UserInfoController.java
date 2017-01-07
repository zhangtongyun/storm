package com.tong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tong.bean.UserInfo;
import com.tong.service.UserInfoService;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/getUserInfo/{id}")
	public String getUserInfo(@PathVariable("id") Integer id,Model model){
		UserInfo info = userInfoService.getUserInfoById(id);
		model.addAttribute("user",info);
		System.out.println(info.getName());
		return "/userInfo";
	}
}
