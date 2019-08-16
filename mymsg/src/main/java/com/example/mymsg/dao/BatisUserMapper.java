package com.example.mymsg.dao;

import com.example.mymsg.entity.BatisUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatisUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BatisUser record);

    int insertSelective(BatisUser record);

    List<BatisUser> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BatisUser record);

    int updateByPrimaryKey(BatisUser record);
}