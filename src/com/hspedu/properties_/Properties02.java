package com.hspedu.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //使用Properties类来读取mysql.properties文件
        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //3.把配置文件显示到控制台
        properties.list(System.out);
        //4.根据key获取对应的值
        String ip = properties.getProperty("ip");
        System.out.println(ip);
    }
}
