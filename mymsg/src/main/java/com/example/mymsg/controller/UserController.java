package com.example.mymsg.controller;

import com.example.mymsg.entity.BatisUser;
import com.example.mymsg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
*1.类需要实例化对象 @Controller
* 2.类中的方法返回的是json @ResponseBody
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public List<BatisUser> getAll(){
        return userService.getAllUser();
    }

    @RequestMapping("/check")
    public boolean check(BatisUser user){
        System.out.println("userService");
        return userService.checkUser(user);
    }

    //设置请求路径 @RequestMapping
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
