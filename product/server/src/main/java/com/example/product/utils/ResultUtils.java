package com.example.product.utils;

import com.example.product.vo.ResultVO;

/**
 * @author THY
 * @date 2018/12/1
 */
public class ResultUtils {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return resultVO;
    }
}
