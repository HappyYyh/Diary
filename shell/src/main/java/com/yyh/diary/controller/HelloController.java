package com.yyh.diary.controller;

import com.yyh.diary.dto.APIResult;
import com.yyh.diary.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * All rights Reserved, Designed By yyh
 *
 * @Package com.yyh.diary.controller
 * @author: yyh
 * @date: 2019-09-05 16:41
 * @since V1.1.0-SNAPSHOT
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public APIResult hello(){
        return APIResult.create(userService.getAll());
    }
}
