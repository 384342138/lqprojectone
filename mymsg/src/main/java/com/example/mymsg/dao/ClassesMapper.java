package com.example.mymsg.dao;

import com.example.mymsg.entity.Classes;

public interface ClassesMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);

}