package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.单线程时长测试;

import java.util.Date;

public class danxiancheng {
    static long time = new Date().getTime();
    public static void main(String[] args) {
        TickerDemo t = new TickerDemo();
        Thread th = new Thread(t);
        th.start();
    }
}
