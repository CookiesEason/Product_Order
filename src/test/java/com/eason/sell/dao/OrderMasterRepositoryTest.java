package com.eason.sell.dao;

import com.eason.sell.dataobject.OrderDetail;
import com.eason.sell.dataobject.OrderMaster;
import com.eason.sell.enums.OrderStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author CookiesEason
 * 2017/12/30 19:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private static String OPENID = "110123";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("12345655");
        orderMaster.setBuyerName("傻掉");
        orderMaster.setBuyerPhone("12345678910");
        orderMaster.setBuyerAddress("没有");
        orderMaster.setBuyerOpenid("110123");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        OrderMaster result= repository.save(orderMaster);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(1,3);
        Page<OrderMaster> result =  repository.findByBuyerOpenid(OPENID,request);
        Assert.assertNotEquals(0, result.getTotalElements());
        System.out.println(result.getTotalElements());
    }
}