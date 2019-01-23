package com.example.product.exception;

import com.example.product.enums.ResultEnum;

/**
 * @author THY
 * @date 2018/12/4
 */
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
