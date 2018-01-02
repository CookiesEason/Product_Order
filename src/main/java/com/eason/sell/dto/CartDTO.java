package com.eason.sell.dto;

import lombok.Data;

/**
 * @author CookiesEason
 * 2018/1/2 14:33
 */
@Data
public class CartDTO {


    /** 商品Id */
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
