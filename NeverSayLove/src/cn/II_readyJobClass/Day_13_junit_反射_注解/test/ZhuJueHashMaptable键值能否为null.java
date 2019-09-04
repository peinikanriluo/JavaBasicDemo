package cn.II_readyJobClass.Day_13_junit_反射_注解.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZhuJueHashMaptable键值能否为null {

    public ZhuJueHashMaptable键值能否为null() {
        int num = 0;
        System.out.println("空参构造运行,访问次数 "+(++num));
    }

    static {
        System.out.println("静态代码块在此");
    }
    @Before
    public  void before(){
        System.out.println("@Before 在方法运行之前运行");
    }
    @Test
    public void test(){
        System.out.println("@Test执行啦");
    }
    @After
    public void after(){
        System.out.println("@After开始执行");
    }
}
