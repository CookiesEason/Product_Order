package com.eason.sell.service;

import com.eason.sell.dataobject.ProductInfo;
import com.eason.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author CookiesEason
 * 2017/12/29 19:16
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     *加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     *减库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架
     * @param productId
     * @return
     */
    ProductInfo onSale(String productId);


    /**
     * 下架
     * @param productId
     * @return
     */
    ProductInfo offSale(String productId);
}
