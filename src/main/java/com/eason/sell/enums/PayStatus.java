package com.eason.sell.enums;

import lombok.Getter;

/**
 * @author CookiesEason
 * 2017/12/30 19:42
 */
@Getter
public enum  PayStatus implements CodeEnum{

    WAIT(0, "等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
