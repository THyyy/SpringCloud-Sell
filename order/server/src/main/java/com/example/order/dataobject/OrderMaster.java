package com.example.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author THY
 * @date 2018/12/2
 */
@Data
@Entity
public class OrderMaster {

    /** 订单编号 */
    @Id
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

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

}
