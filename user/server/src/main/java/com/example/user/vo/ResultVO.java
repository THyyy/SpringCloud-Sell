package com.example.user.vo;

import lombok.Data;

/**
 * @author THY
 * @date 2018/12/3
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}

