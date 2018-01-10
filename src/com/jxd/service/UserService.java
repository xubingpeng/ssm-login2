package com.jxd.service;

import com.jxd.mapper.UserMapper;
import com.jxd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 徐丙鹏
 * @Title:
 * @Package com.jxd.service
 * @Description:
 * @date 2018-01-10 10:52
 */
@Service
public class UserService {
    @Autowired
   private UserMapper userMapper;
    public User login(User user){
        return userMapper.login(user);
    }
}
