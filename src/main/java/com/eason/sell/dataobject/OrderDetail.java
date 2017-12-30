package com.eason.sell.dataobject;

import lombok.Data;
import org.springframework.data.domain.PageRequest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author CookiesEason
 * 2017/12/30 19:47
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /**订单Id*/
    private String orderId;

    /**商品ID*/
    private String productId;

    /**商品名称*/
    private String productName;

    /**商品单价*/
    private BigDecimal productPrice;

    /**商品数量*/
    private Integer productQuantity;

    /**商品小图*/
    private String productIcon;
}
