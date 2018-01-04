package com.eason.sell.VO;

import com.eason.sell.utils.serializer.Date2LongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author CookiesEason
 * 2017/12/30 14:16
 */
@Data
//@JsonSerialize(using = Date2LongSerializer.class)
public class ResultVO<T> {

    /**错误码 */
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
