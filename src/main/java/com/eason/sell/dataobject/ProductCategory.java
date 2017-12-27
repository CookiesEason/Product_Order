package com.eason.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author CookiesEason
 *  2017/12/27
 */
@Entity
@DynamicUpdate //自动更新
@Data
public class ProductCategory {
    /**类目ID */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**类目名字 */
    private String categoryName;

    /**类目编号 */
    private Integer categoryType;

    /**创建时间 */
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
