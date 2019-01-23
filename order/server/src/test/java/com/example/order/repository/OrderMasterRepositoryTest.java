package com.example.order.repository;

import com.example.order.OrderApplicationTests;
import com.example.order.dataobject.OrderMaster;
import com.example.order.enums.OrderStatusEnum;
import com.example.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author THY
 * @date 2018/12/2
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("深圳");
        orderMaster.setBuyerName("王磊");
        orderMaster.setBuyerOpenid("faheurgajk185");
        orderMaster.setBuyerPhone("1534847974341");
        orderMaster.setOrderId("1234567");
        orderMaster.setOrderAmount(new BigDecimal(3.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }

}