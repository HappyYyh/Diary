package com.yyh.diary.dao;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;
import java.util.List;
import com.yyh.diary.entity.*;

/**
 * All rights Reserved, Designed By yyh
 *
 * @author: yyh
 * @date:2019-09-06
 * @since V1.0.0-SNAPSHOT
 */
public interface UserDao extends BaseMapper<User> {

    /**
     * 简单查询
     */
    List<User> sample(User obj);
}
