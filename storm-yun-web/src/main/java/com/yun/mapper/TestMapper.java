package com.yun.mapper;

import java.util.List;

import com.yun.vo.Test;
import com.yun.vo.TestExample;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);
}