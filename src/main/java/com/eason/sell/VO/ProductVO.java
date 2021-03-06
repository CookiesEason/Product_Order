package com.eason.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品(包含类目)
 * @author CookiesEason
 * 2017/12/30 14:29
 */
@Data
public class ProductVO implements Serializable{

    private static final long serialVersionUID = -8524361868215714132L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
