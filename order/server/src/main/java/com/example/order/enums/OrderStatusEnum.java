package com.example.order.enums;

import lombok.Getter;

/**
 * @author THY
 * @date 2018/12/2
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISH(1, "完结订单"),
    CANCLE(2, "取消订单"),

    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
