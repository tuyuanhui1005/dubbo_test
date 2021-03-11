package com.tyh.controller;


import com.tyh.model.user;
import com.tyh.service.userService;
import com.tyh.tools.SnowflakeIdWorker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/user")
@ResponseBody
@Controller
public class userController {

    @Resource
    userService userService;

    @RequestMapping("/add/{name}")
    public int addUser(@PathVariable String name) {

        Long id = SnowflakeIdWorker.generateId();
        String uid = String.valueOf(id);
        user user = new user();
        user.setId(uid);
        user.setName(name);
        return userService.addUser(user);

    }


}
