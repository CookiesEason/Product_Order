package com.eason.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author CookiesEason
 * 2017/12/30 14:16
 */
@Data
public class ResultVO<T> {

    /**错误码 */
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
