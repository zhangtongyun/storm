package com.test;

import net.sf.json.JSONObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tong.bean.UserInfo;
import com.tong.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserInfoServiceTest {

	@Autowired
	private UserInfoService userInfoService;
	
	@Test
	public void userTest(){
		UserInfo info = userInfoService.getUserInfoById(1);
		
		System.out.println(JSONObject.fromObject(info));
	}
}
