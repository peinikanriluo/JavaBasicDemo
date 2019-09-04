package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.单线程时长测试;

import java.util.Date;

public class TickerDemo implements Runnable {
    long time;
    @Override
    public void run() {
        int num = 0;
        while(num<100){
            System.out.println("正在买票        "+num);
            if(num ==99) {
                time = new Date().getTime();
                System.out.println("共消耗时间:"+(time - danxiancheng.time));
            }
            num++;
        }
    }
}
