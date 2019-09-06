package com.yyh.diary.service;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * All rights Reserved, Designed By yyh
 *
 * @Package com.yyh.diary.service
 * @author: yyh
 * @date: 2019-09-06 10:58
 * @since V1.0.0-SNAPSHOT
 */
@Service
public class BaseService {

    @Autowired
    protected SQLManager sqlManager;
}
