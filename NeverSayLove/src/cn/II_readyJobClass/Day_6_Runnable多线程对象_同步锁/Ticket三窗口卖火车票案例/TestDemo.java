package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Ticket三窗口卖火车票案例;

import java.util.Date;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("开始的时间是"+new Date().getTime());
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();


    }
}
