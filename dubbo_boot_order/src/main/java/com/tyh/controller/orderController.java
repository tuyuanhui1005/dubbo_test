package com.tyh.controller;


import com.tyh.model.order;
import com.tyh.service.orderService;
import com.tyh.service.userService;
import com.tyh.tools.SnowflakeIdWorker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@RequestMapping("/order")
@Controller
public class orderController {

    @Resource
    orderService orderService;

  //  @Resource
   // userService userService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public int initOrder() {

        //String name = userService.getUser("529874702896656384").getName();
        order order = new order();
        Long id = SnowflakeIdWorker.generateId();
        String oid = String.valueOf(id);
        order.setOrderId(oid);
        order.setUserId("529874702896656384");
      //  order.setUserName(name);
        return orderService.initOrder(order);
    }

}
