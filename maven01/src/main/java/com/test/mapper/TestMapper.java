package com.test.mapper;

import com.test.entity.Student;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {
    @Select("select * from student where sid = #{sid}")
    public Student getStudentBySid(int sid);
}
