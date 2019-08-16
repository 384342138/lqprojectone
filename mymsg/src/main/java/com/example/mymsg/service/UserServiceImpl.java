package com.example.mymsg.service;

import com.example.mymsg.dao.BatisUserMapper;
import com.example.mymsg.dao.UserDao;
import com.example.mymsg.entity.BatisUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    BatisUserMapper batisUser;

    @Autowired
    UserDao userDao;
    @Override
    public List<BatisUser> getAllUser(){
        return batisUser.selectByPrimaryKey(1);
    }

    @Override
    public List<BatisUser> getAllUser(int pageNum, int pageSize) {
        return userDao.getAllUser(pageNum*pageSize-1,pageSize);
    }

    @Override
    public boolean checkUser(BatisUser user) {

        return user == null;
    }

}
