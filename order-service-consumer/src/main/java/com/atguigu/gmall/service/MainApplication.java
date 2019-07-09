package com.atguigu.gmall.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成...");
        System.in.read(); // 按任意键退出
    }
}
