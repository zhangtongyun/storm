package com.tong.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tong.bean.UserInfo;
import com.tong.mapper.UserInfoMapper;
import com.tong.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	private static Logger logger = Logger.getLogger(UserInfoServiceImpl.class); 
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserInfoById(Integer id) {
		logger.info("ID:"+id);
		return userInfoMapper.selectByPrimaryKey(id);
	}

}
