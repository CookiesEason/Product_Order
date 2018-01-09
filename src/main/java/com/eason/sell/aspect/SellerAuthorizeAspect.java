package com.eason.sell.aspect;

import com.eason.sell.constant.CookieConstant;
import com.eason.sell.constant.RedisConstant;
import com.eason.sell.exception.SellerAuthorizeException;
import com.eason.sell.utils.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author CookiesEason
 * 2018/1/9 16:49
 */
@Aspect
@Component
@Slf4j
public class SellerAuthorizeAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Pointcut("execution(public * com.eason.sell.controller.Seller*.*(..))"+
    "&& !execution(public * com.eason.sell.controller.SellerUserController.*(..))")
    public void verify() {}

    @Before("verify()")
    public void doVerify(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //查询Cookie
        Cookie cookie = CookieUtil.get(request, CookieConstant.TKOEN);
        if (cookie == null){
            log.warn("【登录校验】Cookie中查不到Token");
            throw new SellerAuthorizeException();
        }
        //Redis查询
        String tokenValue = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX,cookie.getValue()));
        if (StringUtils.isEmpty(tokenValue)){
            log.warn("【登录校验】Redis内查询不到Token");
            throw new SellerAuthorizeException();
        }
    }
}
