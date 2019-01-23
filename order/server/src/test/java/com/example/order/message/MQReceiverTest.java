package com.example.order.message;

import com.example.order.OrderApplicationTests;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * 发送MQ消息测试
 * @author THY
 * @date 2018/12/6
 */
@Component
public class MQReceiverTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void process() {
        amqpTemplate.convertAndSend("myQueue", "now" + new Date());
    }

    @Test
    public void processOrder() {
        amqpTemplate.convertAndSend("myOrder","computer", "now" + new Date());
    }
}