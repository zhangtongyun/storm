package com.yun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yun.service.TestService;
import com.yun.vo.Test;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/ss")
	public String getTest(Model model){
		
		List<Test> list = testService.selectTest();
		model.addAttribute("id", list.get(0).getAa());
		return "/test";
	}
}
