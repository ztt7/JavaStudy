package com.test.testpackage;

import org.junit.Assert;
import org.junit.Test;

public class Test01 {
    @Test
    public void method() {
        System.out.println("我是测试用例1");
        Assert.assertEquals(1,1);
    }

    @Test
    public void method2() {
        System.out.println("我是测试用例2");
    }
}
