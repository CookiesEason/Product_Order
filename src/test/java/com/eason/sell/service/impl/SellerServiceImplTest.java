package com.eason.sell.service.impl;

import com.eason.sell.dataobject.SellerInfo;
import com.eason.sell.service.SellerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author CookiesEason
 * 2018/1/9 13:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    public static final String openid = "adb";

    @Autowired
    private SellerService sellerService;

    @Test
    public void findSellerInfoByOpenid() {
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);
        Assert.assertNotNull(result);
    }
}