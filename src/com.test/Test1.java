package com.test;

import com.test.entity.Student;

import java.sql.*;

//public class Test1 {
//    public static void main(String[] args) {
//        //1. 通过DriverManager来获得数据库连接
//        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","12345678");
//             //2. 创建一个用于执行SQL的Statement对象
//             Statement statement = connection.createStatement()){   //注意前两步都放在try()中，因为在最后需要释放资源！
//
//            //3. 执行SQL语句，并得到结果集
////            int re = statement.executeUpdate("insert into study.student values(127,'小刚','男')");
////            System.out.println(re);
//            ResultSet set = statement.executeQuery("select * from study.student");
//
//            //4. 查看结果
//            while (set.next()){
////                Student student = new Student(set.getInt(1), set.getString(2), set.getString(3));
//                student.say();
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        //5. 释放资源，try-with-resource语法会自动帮助我们close
//    }
//}
