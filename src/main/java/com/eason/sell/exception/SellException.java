package com.eason.sell.exception;

import com.eason.sell.enums.ResultEnum;

/**
 * @author CookiesEason
 * 2018/1/2 14:08
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
