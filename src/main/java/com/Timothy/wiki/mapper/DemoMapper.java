package com.Timothy.wiki.mapper;

import com.Timothy.wiki.domain.Demo;
import com.Timothy.wiki.domain.demoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemoMapper {
    long countByExample(demoExample example);

    int deleteByExample(demoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(demoExample example);

    Demo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") demoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") demoExample example);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}