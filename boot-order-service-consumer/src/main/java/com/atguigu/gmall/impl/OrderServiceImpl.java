package com.atguigu.gmall.impl;


import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户Id：" + userId );
        List<UserAddress> addressList= userService.getUserAddressList(userId);
        return addressList;
    }
}
