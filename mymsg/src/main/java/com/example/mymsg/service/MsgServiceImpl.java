package com.example.mymsg.service;

import com.example.mymsg.dao.MsgDao;
import com.example.mymsg.entity.BatisMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgServiceImpl implements MsgService{

    @Autowired
    MsgDao msgDao;

    @Override
    public List<BatisMsg> getAllMsg() {
        return msgDao.getAllMsg();
    }

    @Override
    public List<BatisMsg> getPageMsg(int pageNum, int pageSize) {
        return msgDao.getPageMsg(pageNum,pageSize);
    }

    @Override
    public int insertMsg(BatisMsg msg) {
        System.out.println("MS插入2" +msg.getAuthor()+msg.getMsg());
        return msgDao.insertMsg(msg);
    }

    @Override
    public int getPageNum() {
        System.out.println((int) Math.ceil(msgDao.getPageNum()/4.0));
        return (int) Math.ceil(msgDao.getPageNum()/4.0);
    }
}
