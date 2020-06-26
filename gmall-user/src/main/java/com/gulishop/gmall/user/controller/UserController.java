package com.gulishop.gmall.user.controller;

import com.gulishop.gmall.user.bean.UmsMember;
import com.gulishop.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello woreld";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }
}
