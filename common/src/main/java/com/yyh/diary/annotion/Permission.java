package com.yyh.diary.annotion;

import java.lang.annotation.*;

/**
 * All rights Reserved, Designed By yyh
 *
 * @Package com.yyh.diary.annotion
 * @author: yyh
 * @date: 2019-09-05 16:28
 * @since V1.1.0-SNAPSHOT
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Permission {

    /**
     * 权限名称
     * @return
     */
    String[] value() default {};
}
