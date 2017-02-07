package org.storm.yun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.storm.yun.bean.UserInfo;
import org.storm.yun.comm.Result;
import org.storm.yun.service.UserInfoService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/qq")
	@ResponseBody
	public Result<UserInfo> ttest(){
		Result<UserInfo> result = new Result<UserInfo>();
		UserInfo user = userInfoService.getUserInfoById(1);
		result.setDataMap(user);
		return result;
	}
}
