package com.eason.sell.service;

import com.eason.sell.dto.OrderDTO;

/**
 * 买家
 * @author CookiesEason
 * 2018/1/4 17:01
 */
public interface BuyerService {

    /**查询一个订单
     *
     * @param openid
     * @param orderId
     * @return OrderDTO
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**取消订单
     *
     * @param openid
     * @param orderId
     * @return OrderDTO
     */
    OrderDTO cancelOrder(String openid, String orderId);

}
