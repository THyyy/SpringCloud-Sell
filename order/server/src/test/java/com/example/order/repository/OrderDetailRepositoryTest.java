package com.example.order.repository;

import com.example.order.OrderApplicationTests;
import com.example.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author THY
 * @date 2018/12/3
 */
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("157875196366160022");
        orderDetail.setProductIcon("//fuss10.elemecdn.com/0/49/65d10ef215d3c770ebb2b5ea962a7jpeg.jpeg");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setDetailId("12367");
        orderDetail.setProductQuantity(2);
        orderDetail.setProductPrice(new BigDecimal(0.01));

        OrderDetail result = orderDetailRepository.save(orderDetail);
        assertNotNull(result);
    }
}