package com.tyh.ServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tyh.dao.userMapper;
import com.tyh.model.user;
import com.tyh.model.userExample;
import com.tyh.service.userService;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.List;


@Component
@Service
public class userServiceImpl  implements userService {

    @Resource
    userMapper userMapper;


    @Override
    public int addUser(user user) {

        return  userMapper.insert(user);
    }

    @Override
    public user getUser(String id) {

        userExample userExample = new userExample();
        userExample.createCriteria().andIdEqualTo(id);
        List<user> list = userMapper.selectByExample(userExample);
        return list.get(0);
    }


}
