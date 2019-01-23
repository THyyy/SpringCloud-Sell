package com.example.order.message;

import com.example.order.OrderApplicationTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;


/**
 * @author THY
 * @date 2018/12/7
 */
@Component
public class StreamClientTest extends OrderApplicationTests {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/sendMessage")
    public void process() {
        String message = "now "+ new Date();
        streamClient.outPut().send(MessageBuilder.withPayload(message).build());
    }

}