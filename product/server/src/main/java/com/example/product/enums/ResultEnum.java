package com.example.product.enums;

import lombok.Getter;

/**
 * @author THY
 * @date 2018/12/4
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "商品库存错误"),
    ;

    public Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
