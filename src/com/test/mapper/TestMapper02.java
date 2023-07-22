package com.test.mapper;

import com.test.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper02 {
    @Insert("insert into student(name, sex) values(#{name}, #{sex})")
    int addStudent(Student student);

//    @Select("select * from teacher where tid = #{tid}")
//    Teacher getTeacherBySid(int tid);

    @Select("select * from student inner join teach on student.sid = teach.sid where tid = #{tid}")
    List<Student> getStudentByTid(int tid);

    @Select("select * from student where sid = #{sid} and sex = #{sex}")
    Student getStudentBySidAndSex(@Param("sid") int sid, @Param("sex") String sex);
}
