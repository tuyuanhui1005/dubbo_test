package com.tyh.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.tyh.dao.orderMapper;
import com.tyh.model.order;
import com.tyh.service.orderService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
@Service
public class OrderServiceImpl implements orderService {


    @Resource
    orderMapper orderMapper;


    @Override
    public int initOrder(order order) {

        return orderMapper.insert(order);
    }
}
