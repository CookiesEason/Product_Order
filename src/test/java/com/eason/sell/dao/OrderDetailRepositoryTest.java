package com.eason.sell.dao;

import com.eason.sell.dataobject.OrderDetail;
import org.hibernate.criterion.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author CookiesEason
 * 2017/12/30 20:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void SaveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345678900");
        orderDetail.setOrderId("111111");
        orderDetail.setProductId("123");
        orderDetail.setProductPrice(new BigDecimal(5));
        orderDetail.setProductName("皮蛋瘦肉粥");
        orderDetail.setProductIcon("xxxx.jpg");
        orderDetail.setProductQuantity(3);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> detailList = repository.findByOrderId("111111");
        Assert.assertNotEquals(0, detailList.size());
    }
}