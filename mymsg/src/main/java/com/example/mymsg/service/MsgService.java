package com.example.mymsg.service;

import com.example.mymsg.entity.BatisMsg;
import com.example.mymsg.entity.Msg;

import java.util.List;

public interface MsgService {
    public List<BatisMsg> getAllMsg();

    public List<BatisMsg> getPageMsg(int pageNum,int pageSize);

    public int insertMsg(BatisMsg msg);

    public int getPageNum();
}
