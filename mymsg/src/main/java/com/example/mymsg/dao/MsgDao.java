package com.example.mymsg.dao;

import com.example.mymsg.entity.BatisMsg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MsgDao {
    public List<BatisMsg> getAllMsg();

    public List<BatisMsg> getPageMsg(int pageNum,int pageSize);

    public int getPageNum();

    public int insertMsg(BatisMsg msg);
}
