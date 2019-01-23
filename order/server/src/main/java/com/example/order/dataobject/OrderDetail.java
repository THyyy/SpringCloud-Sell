package com.example.order.dataobject;

import com.sun.xml.internal.stream.StaxErrorReporter;
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
public class OrderDetail {

    /** 订单详情编号 */
    @Id
    private String detailId;

    /** 订单编号 */
    private String orderId;

    /** 商品编号 */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图 */
    private String productIcon;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}
