package org.lanqiao.mapper;

import org.lanqiao.entity.Orders;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer order_id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer order_id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}