package com.gulishop.gmall.user.service.serviceImpl;

import com.gulishop.gmall.user.bean.UmsMember;
import com.gulishop.gmall.user.mapper.UserMapper;
import com.gulishop.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
