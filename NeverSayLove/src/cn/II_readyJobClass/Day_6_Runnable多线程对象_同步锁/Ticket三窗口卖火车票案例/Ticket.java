package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Ticket三窗口卖火车票案例;

import java.util.Date;

public class Ticket implements Runnable {
        static int num = 100;
    @Override
    public void run() {
        while(num>0){
            SynchronizedTest();
            if(num==1) System.out.println("结束的时间是----------------------------------"+new Date().getTime());
        }

    }

    private static synchronized void SynchronizedTest() {
//        if(num<1) return;
        System.out.println(Thread.currentThread().getName()+"正在买票"+num);
        num--;

    }

}
