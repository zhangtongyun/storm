package org.storm.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/qq")
	@ResponseBody
	public String ttest(){
		
		return "Hello Word! ";
	}
}
