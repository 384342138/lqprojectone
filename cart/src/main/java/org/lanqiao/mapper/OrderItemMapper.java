package org.lanqiao.mapper;

import org.lanqiao.entity.OrderItem;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer order_item_id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer order_item_id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}