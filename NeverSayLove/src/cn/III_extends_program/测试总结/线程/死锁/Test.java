package cn.III_extends_program.测试总结.线程.死锁;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        LeftRightDeadlock leftRightDeadlock = new LeftRightDeadlock();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                leftRightDeadlock.leftRight();
            }
        };
        Runnable runnable2 = new Runnable() {

            @Override
            public void run() {
                leftRightDeadlock.rightLeft();
            }
        };
        Callable<Object> callable = new Callable<Object>() {
            public Object call() throws Exception {
                System.out.println("runnable2 = " + runnable2);
                return "hah";
            }
        };

        es.submit(runnable1);
        Thread.sleep(1000);
        es.submit(runnable2);
    }
}
