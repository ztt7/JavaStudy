package com.test.testpackage;

import java.sql.SQLOutput;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test02 {
    public static void main(String[] args) {
        //不可能new
        Logger logger = Logger.getLogger(Test02.class.getName());
        logger.info("msg|我是logger info");
        //通过日志打印，结果如下：
        //七月 23, 2023 8:43:44 下午 com.test.testpackage.Test02 main   ------时间  类名  方法
        //信息: msg|我是logger info

        logger.log(Level.SEVERE,"出现了严重错误");

        System.getProperties().forEach((k,v) -> System.out.println(k + ":  " + v));

    }
}
