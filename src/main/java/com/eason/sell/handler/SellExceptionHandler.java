package com.eason.sell.handler;

import com.eason.sell.VO.ResultVO;
import com.eason.sell.exception.SellException;
import com.eason.sell.exception.SellerAuthorizeException;
import com.eason.sell.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

}
