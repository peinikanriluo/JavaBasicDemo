package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Runable接口测试;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        Thread t5 = new Thread(mr);
        es.submit(mr);
        for (int i = 0; i < 20; i++) {
            System.out.println("你是猪"+i);
        }

    }
}
