package com.eason.sell.utils;

import java.util.Random;

/**
 * @author CookiesEason
 * 2018/1/2 14:21
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数字
     * @return
     */
    public static synchronized String genUnique(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
