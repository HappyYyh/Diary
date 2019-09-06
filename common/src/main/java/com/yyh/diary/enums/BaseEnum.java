package com.yyh.diary.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * All rights Reserved, Designed By 863044052@qq.com
 *
 * @Package com.yyh.diary.dto
 * @author: yyh
 * @date: 2019-09-05 16:28
 * @since V1.1.0-SNAPSHOT
 */
@AllArgsConstructor
public enum BaseEnum {

    /**
     *  基础的枚举
     */
    SUCCESS(200,""),
    ERROR(500,"Internal Server Error"),
    PARAM_HAS_ERROR(501,"参数错误!"),

    ;

    @Getter
    private Integer code;
    @Getter
    private String msg;
}
