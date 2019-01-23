package com.example.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态枚举值
 * @author THY
 * @date 2018/12/1
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
