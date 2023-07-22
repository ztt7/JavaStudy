package com.hspedu.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取nysql.properties文件，并得到ip,user和pwd
        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ( (line = br.readLine()) != null){//循环读取
//            System.out.println(line);
            String[] splitline = line.split("=");
//            System.out.println(splitline[0] + "值为：" + splitline[1]);


            //如果我们指定要ip的值
            if("ip".equals(splitline[0])){
                System.out.println(splitline[0] + "值为：" + splitline[1]);
            }
        }
        br.close();
    }
}
