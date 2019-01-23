package com.example.order.controller;

import com.example.order.dto.OrderDTO;
import com.example.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author THY
 * @date 2018/12/7
 */
@RestController
public class StreamController {


    @Autowired
    private StreamClient streamClient;

    // @GetMapping("/sendMessage")
    // public void process() {
    //     String message = "now test";
    //     streamClient.outPut().send(MessageBuilder.withPayload(message).build());
    // }

    @GetMapping("/sendMessage")
    public void process() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("154688");
        streamClient.outPut().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
