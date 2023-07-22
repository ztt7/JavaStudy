package com.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MybatisUtil {

    //创建一个静态对象，在类加载时就进行创建，创建好了
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            // build方法里面还可以指定环境
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("src/mybatis-config.xml"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取一个新的会话
     * @param autoCommit 是否开启自动提交（跟JDBC是一样的，如果不自动提交，则会变成事务操作）
     * @return SqlSession对象
     */
    public static SqlSession getSession(boolean autoCommit){
        return sqlSessionFactory.openSession(autoCommit);
    }
}
