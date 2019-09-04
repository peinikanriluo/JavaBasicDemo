package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.newFixedThreadPool线程池测试;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        Runnable r = new Runnable() {
            int times = 0;
            String b = " ";
            @Override
            public void run() {
                    while (true) {
                synchronized (b) {
                        if (times < 100) {
                            System.out.println(Thread.currentThread().getName()+"所有线程一起来干我吧" + times);
                            times++;
                        } else break;
                    }
                }
            }
        };
        e.submit(r);
        e.submit(r);

        e.shutdown();

    }
}
