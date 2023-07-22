package com.test.entity;


import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    Integer sid;
    String name;
    String sex;

//    public Student(String name,String sex) {
////        this.sid = sid;
//        this.name = name;
//        this.sex = sex;
//        System.out.println("我被构造了");
//    }


    public void say(){
        System.out.println("我叫："+name+"，学号为："+sid+"，我的性别是："+sex);
    }
}