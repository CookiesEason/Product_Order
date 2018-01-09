package com.eason.sell.service.impl;

import com.eason.sell.dao.SellerInfoRepository;
import com.eason.sell.dataobject.SellerInfo;
import com.eason.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CookiesEason
 * 2018/1/9 13:46
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoRepository.findByOpenid(openid);
    }
}
