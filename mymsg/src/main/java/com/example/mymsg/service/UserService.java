package com.example.mymsg.service;

import com.example.mymsg.entity.BatisUser;

import java.util.List;

public interface UserService {
    public List<BatisUser> getAllUser();

    public List<BatisUser> getAllUser(int pageNum,int pageSize);

    public boolean checkUser(BatisUser user);
}
