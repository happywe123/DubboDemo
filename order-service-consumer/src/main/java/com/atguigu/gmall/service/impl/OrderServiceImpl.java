package com.atguigu.gmall.service.impl;


import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户Id：" + userId );
        List<UserAddress> addressList= userService.getUserAddressList(userId);
        for(UserAddress userAddress:addressList){
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
