package org.lanqiao.service;


import org.lanqiao.entity.OrderItem;
import org.lanqiao.entity.Orders;
import org.lanqiao.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    public int creatOrder(List<OrderItem> orderItem, Orders orders);
}
