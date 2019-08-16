package com.example.mymsg.dao;

import com.example.mymsg.entity.BatisUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<BatisUser> getAllUser();

    public List<BatisUser> getAllUser(int currNum,int pageSize);

    public BatisUser checkUser(BatisUser user);

    public int getUserCount();
}
