package com.test;

import com.test.entity.Student;
import org.apache.ibatis.session.SqlSession;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * main --通过指定id--  TestMapper.xml
 */
public class MybatisReadXml {
    public static void main(String[] args) throws FileNotFoundException {
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("src/mybatis-config.xml"));
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            //暂时还没有业务
//            System.out.println(sqlSession);
            List<Student> selectStudent = sqlSession.selectList("selectStudent");
            selectStudent.forEach(System.out::println);
        }

    }
}
