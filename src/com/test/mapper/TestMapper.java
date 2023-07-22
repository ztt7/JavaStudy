package com.test.mapper;

import com.test.entity.Student;

import java.util.List;

public interface TestMapper {
    List<Student> selectStudent();//通过接口，可以直接明确返回的类型。后续还可以通过接口使用注解进行开发。
    //mybatis帮我们动态生成了接口的实现类，通过实现类调用方法。
}
