package com.eason.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author CookiesEason
 * 2017/12/29 19:22
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "上架"),
    DOWN(0, "下架")
    ;

    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
