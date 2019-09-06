package com.yyh.diary.annotion;

import java.lang.annotation.*;

/**
 * All rights Reserved, Designed By 863044052@qq.com
 *
 * Documented:表明这个注解应该被javadoc工具记录
 * Target(ElementType.METHOD):作用于方法级别
 * Retention(RetentionPolicy.RUNTIME):这种类型的Annotations将被JVM保留,
 * 所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.
 *
 * @Package com.yyh.diary.annotion
 * @author: yyh
 * @date: 2019-09-05 16:28
 * @since V1.1.0-SNAPSHOT
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthToken {
}
