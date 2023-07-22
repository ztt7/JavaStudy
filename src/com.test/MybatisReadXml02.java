package com.test;

import com.test.entity.Student;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
/**
 * main --  接口mapper  --  TestMapper.xml
 */
public class MybatisReadXml02 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
            List<Student> student = testMapper.selectStudent();//通过接口调用里面的方法（实现类调用方法）
            student.forEach(System.out::println);

            System.out.println(testMapper.getClass());///class com.sun.proxy.$Proxy4
        }
    }
}
