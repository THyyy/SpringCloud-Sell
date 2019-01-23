package com.example.order.message;

import com.example.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author THY
 * @date 2018/12/7
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    // @StreamListener(StreamClient.INPUT)
    // public void proccess(String message) {
    //     log.info("StreamReceiver: {}", message);
    // }

    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String proccess(OrderDTO message) {
        log.info("StreamReceiver: {}", message);
        return "返回消息";
    }

    @StreamListener(StreamClient.INPUT2)
    public void proccess(String message) {
        log.info("StreamReceiver2: {}", message);
    }
}
