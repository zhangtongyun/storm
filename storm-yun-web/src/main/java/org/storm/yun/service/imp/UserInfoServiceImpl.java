package org.storm.yun.service.imp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.storm.yun.bean.UserInfo;
import org.storm.yun.mapper.UserInfoMapper;
import org.storm.yun.service.UserInfoService;

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
