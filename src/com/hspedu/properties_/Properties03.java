package com.hspedu.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties类来创建配置文件，修改配置文件内容

        Properties properties = new Properties();
        //创建
        //1.如果该文件没有key就是创建
        //2.如果该文件有key,就是修改
        //Properties父类是Hashtable,底层就是Hashtable核心方法
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");//注意保存时，是中文的unicode码值
        properties.setProperty("pwd","666");

        //将k-V存储文件中即可
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
        System.out.println("保存配置文件成功~");
    }
}
