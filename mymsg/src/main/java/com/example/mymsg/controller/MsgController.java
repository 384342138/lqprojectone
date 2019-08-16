package com.example.mymsg.controller;

import com.example.mymsg.entity.BatisMsg;
import com.example.mymsg.entity.Msg;
import com.example.mymsg.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MsgController {
    @Autowired
    MsgService msgService;

    @RequestMapping("/msg")
    public List<BatisMsg> getAllMsg(){
        return msgService.getAllMsg();
    }

    @RequestMapping("/getmsgnum")
    public int getPageNum(){
        return msgService.getPageNum();
    }

    @RequestMapping("/pagemsg")
    public List<BatisMsg> getPageMsg(int pageNum,int pageSize){

        return msgService.getPageMsg(pageNum,pageSize);
    }

    @RequestMapping("/insert")
    public int  insertMsg(BatisMsg msg){
        System.out.println("MCon插入1"+msg.getAuthor()+msg.getMsg());
        return msgService.insertMsg(msg);
    }
}
