package com.yyh.diary.service.impl;

import com.yyh.diary.dao.UserDao;
import com.yyh.diary.entity.User;
import com.yyh.diary.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * All rights Reserved, Designed By yyh
 *
 * @Package com.yyh.diary.service.impl
 * @author: yyh
 * @date: 2019-09-06 11:35
 * @since V1.0.0-SNAPSHOT
 */
@Service
public class UserService extends BaseService {

    @Autowired
    private UserDao userDao;

    public List<User> getAll(){
        //return userDao.sample(null);
        return sqlManager.all(User.class);
    }
}
