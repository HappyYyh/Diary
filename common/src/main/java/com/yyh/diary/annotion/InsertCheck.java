package com.yyh.diary.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * All rights Reserved, Designed By yyh
 * 数据插入之前的检查是否有存在记录。
 * @Package com.yyh.diary.annotion
 * @author: yyh
 * @date: 2019-09-05 16:28
 * @since V1.1.0-SNAPSHOT
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface InsertCheck {

    /**
    * <p> 相同的字段 : eqField = xxx </p>
    * @param
    * @return String[]
    * @author yyh
    * @date 2019-09-05 16:28
    *
    */
    String[] eqFields() default {};

    /**
     * <p> 不相同的字段 ：noEqField !=xxx </p>
     * @param
     * @return String[]
     * @author yyh
     * @date 2019-09-05 16:28
     *
     */
    String[] noEqFields() default {};

}
