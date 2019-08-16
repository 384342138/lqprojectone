package com.example.mymsg.dao;

import com.example.mymsg.entity.BatisMsg;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BatisMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BatisMsg record);

    int insertSelective(BatisMsg record);

    BatisMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BatisMsg record);

    int updateByPrimaryKey(BatisMsg record);
}