package com.freelf.controller;

import com.freelf.model.MuslfUserEntity;
import com.freelf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENQI on 2016/11/13.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping(value="/toLogin", method = RequestMethod.GET)
    public String toLogin(){
        return "/login";
    }

    @ResponseBody
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public Map<String,Object> login(MuslfUserEntity user){
        Map<String,Object> map = new HashMap<String,Object>();
        System.out.println(user.toString());
        boolean loginResult = userService.isExist(user);
        map.put("loginResult", loginResult);
        return map;
    }

    @RequestMapping(value="/myTest")
    public String myTest(MuslfUserEntity user){
        Map<String,Object> map = new HashMap<String,Object>();
        System.out.println(user.toString());
        boolean loginResult = userService.isExist(user);
        map.put("loginResult", loginResult);
        return "/login";
    }
}
