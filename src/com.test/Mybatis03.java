package com.test;

import com.test.entity.Student;
import com.test.mapper.TestMapper02;
import org.apache.ibatis.session.SqlSession;

public class Mybatis03 {
    public static void main(String[] args) {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            TestMapper02 mapper = sqlSession.getMapper(TestMapper02.class);
//            mapper.addStudent(new Student().setName("小王").setSex("nan"));
            System.out.println(mapper.getStudentBySidAndSex(124,"女"));
        }
    }
}
