package com.eason.sell.handler;

import com.eason.sell.exception.SellerAuthorizeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CookiesEason
 * 2018/1/9 17:02
 */
@ControllerAdvice
public class SellExceptionHandler {

    /**
     * 拦截登录异常
     */
    @ExceptionHandler(value = SellerAuthorizeException.class)
    @ResponseBody
    public String handlerSellerAuthorizeException(){
        return "not login";
    }
}
