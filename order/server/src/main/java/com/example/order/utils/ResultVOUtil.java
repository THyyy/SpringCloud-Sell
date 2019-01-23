package com.example.order.utils;

import com.example.order.VO.ResultVO;

/**
 * @author THY
 * @date 2018/12/3
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
