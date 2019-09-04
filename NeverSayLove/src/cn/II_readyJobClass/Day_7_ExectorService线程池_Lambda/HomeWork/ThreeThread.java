package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.HomeWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreeThread {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Runnable r1 = ()->{
            int multi = 1;
            for (int i = 1; i < 6; i++) {
                multi *= i;
            }
            System.out.println(Thread.currentThread().getName()+"计算得5的阶层是"+multi);
        };
        es.submit(r1);
        Runnable r2 = ()->{
            int multi = 1;
            for (int i = 1; i < 11; i++) {
                multi *= i;
            }
            System.out.println(Thread.currentThread().getName()+"计算得10的阶层是"+multi);
        };
        es.submit(r2);
        Runnable r3 = ()->{
            int multi = 1;
            for (int i = 1; i < 9; i++) {
                multi *= i;
            }
            System.out.println(Thread.currentThread().getName()+"计算得8的阶层是"+multi);
        };
        es.submit(r3);
        es.shutdown();

    }
}
