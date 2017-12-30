package com.eason.sell.dataobject;

import com.eason.sell.enums.OrderStatusEnum;
import com.eason.sell.enums.PayStatus;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author CookiesEason
 * 2017/12/30 18:55
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    /**订单ID*/
    @Id
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /**买家手机号*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信Openid*/
    private String buyerOpenid;

    /**订单总金额*/
    private BigDecimal orderAmount;

    /**订单状态，默认为0为新订单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**支付状态*/
    private Integer payStatus = PayStatus.WAIT.getCode();

    /**创建订单时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;
}
