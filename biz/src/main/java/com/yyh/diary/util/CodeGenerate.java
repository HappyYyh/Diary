package com.yyh.diary.util;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.kit.GenKit;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.gen.CodeGen;
import org.beetl.sql.ext.gen.GenConfig;
import org.beetl.sql.ext.gen.MapperCodeGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * All rights Reserved, Designed By yyh
 *
 * @Package com.yyh.diary.util
 * @author: yyh
 * @date: 2019-09-05 17:31
 * @since V1.1.0-SNAPSHOT
 */
public class CodeGenerate {

    private static final String URL = "jdbc:mysql://120.79.252.252:3306/db_diary";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    /**
    * <p> 代码生成 </p>
    * @param mdPath      md文件路径 （e.g."mapper"）
    * @param pojoPath    pojo路径   （e.g."com.yyh.diary.entity"）
    * @param daoPath     dao路径    （e.g."com.yyh.diary.dao"）
    * @param tableIgnore 表前缀忽略  （e.g."tbl"）
    * @param tableName   表名       （e.g."tbl_user"）
    * @return void
    * @author yyh
    * @date 2019-09-06
    *
    */
    private static void genTemplateCode(String mdPath,String pojoPath,String daoPath,String tableIgnore,String tableName){
        //加载驱动
        ConnectionSource source = ConnectionSourceHelper.getSimple(DRIVER, URL, USER_NAME, PASSWORD);
        DBStyle mysql = new MySqlStyle();
        // md目录
        SQLLoader loader = new ClasspathLoader(mdPath);
        //下划线风格的，
        UnderlinedNameConversion nc = new  UnderlinedNameConversion();
        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});

        //加载pojo配置，位于classpath下
        GenConfig config = new GenConfig("gen/pojoTemplate.btl");
        //表名前缀忽略
        config.setIgnorePrefix(tableIgnore);
        //dao生成配置
        MapperCodeGen codeGen = new MapperCodeGen(daoPath);
        codeGen.setMapperTemplate(new GenConfig().getTemplate("gen/mapperTemplate.btl"));
        List<CodeGen> list = new ArrayList<>();
        list.add(codeGen);
        config.codeGens = list;
        //由于默认的路径为src ，但是多module下没有src目录，所以使用相对路径定位
        GenKit.setSrcPathRelativeToSrc("../biz/src/main/java/");
        GenKit.setResourcePathRelativeToSrc("../biz/src/main/resources");
        try {
            //没有指定表名，默认生成全部表
            if (null == tableName) {
                sqlManager.genALL(pojoPath, config, null);
            } else{
                //生成pojo以及dao
                sqlManager.genPojoCode(tableName, pojoPath, config);
                //生成md文件
                //todo 没有找到自定义md模板的方法，其内部new了一个MDCodeGen,无法指定Template
                sqlManager.genSQLFile(tableName, config);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        genTemplateCode("mapper","com.yyh.diary.entity","com.yyh.diary.dao","tbl","tbl_history");
    }
}
