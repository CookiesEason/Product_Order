package com.eason.sell.exception;

import com.eason.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * @author CookiesEason
 * 2018/1/2 14:08
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
