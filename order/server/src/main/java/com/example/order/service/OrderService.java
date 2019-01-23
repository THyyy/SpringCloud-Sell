package com.example.order.service;

import com.example.order.dto.OrderDTO;

/**
 * @author THY
 * @date 2018/12/3
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 完结订单
     * 只能卖家操作
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);

}
