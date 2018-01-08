package form;

import lombok.Data;

/**
 * @author CookiesEason
 * 2018/1/8 22:12
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /**类目名字 */
    private String categoryName;

    /**类目编号 */
    private Integer categoryType;
}
