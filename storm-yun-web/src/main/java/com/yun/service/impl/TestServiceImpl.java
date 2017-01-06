package com.yun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yun.mapper.TestMapper;
import com.yun.service.TestService;
import com.yun.vo.Test;
import com.yun.vo.TestExample;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	public List<Test> selectTest() {
		
		TestExample example = new TestExample();
		example.setOrderByClause("aa");
		return testMapper.selectByExample(example);
	}

}
