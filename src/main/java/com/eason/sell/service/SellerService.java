package com.eason.sell.service;

import com.eason.sell.dataobject.SellerInfo;

/**
 * 卖家端
 * @author CookiesEason
 * 2018/1/9 13:45
 */
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);


}
