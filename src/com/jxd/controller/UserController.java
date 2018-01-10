package com.jxd.controller;

import com.jxd.pojo.User;
import com.jxd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 徐丙鹏
 * @Title:
 * @Package com.jxd.controller
 * @Description:
 * @date 2018-01-10 10:55
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = {"/login","/log"},method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView login (User user){
        ModelAndView modelAndView=new ModelAndView();
        User u=userService.login(user);
        if(u!=null){
            modelAndView.addObject("success","登录成功");
            modelAndView.setViewName("/success.jsp");
        }
        else{
            modelAndView.addObject("error","登录失败");
            modelAndView.setViewName("/error.jsp");
        }
        return modelAndView;
    }
}
