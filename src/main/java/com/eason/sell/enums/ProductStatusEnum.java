package com.eason.sell.enums;

import lombok.Getter;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * 商品状态
 * @author CookiesEason
 * 2017/12/29 19:22
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {

    UP(0, "上架"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
