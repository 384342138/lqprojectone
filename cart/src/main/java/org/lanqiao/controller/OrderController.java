package org.lanqiao.controller;

import org.lanqiao.entity.OrderItem;
import org.lanqiao.entity.Orders;
import org.lanqiao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/insertOrder")
    public int creatOrder(List<OrderItem> orderItem, Orders orders){
        return orderService.creatOrder(orderItem,orders);
    }
}
