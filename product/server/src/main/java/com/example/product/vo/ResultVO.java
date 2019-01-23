package com.example.product.vo;

import lombok.Data;

/**
 * @author THY
 * @date 2018/12/1
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 具体内容
     */
    private T data;
}