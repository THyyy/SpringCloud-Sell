package com.example.order.dto;

import com.example.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author THY
 * @date 2018/12/3
 */
@Data
public class OrderDTO {

    /** 订单编号 */
    private String orderId;

    /** 买家姓名 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家openid */
    private String buyerOpenid;

    /** 商品总价 */
    private BigDecimal orderAmount;

    /** 订单状态 默认为0新下单*/
    private Integer orderStatus;

    /** 支付状态 默认为0未支付 */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
