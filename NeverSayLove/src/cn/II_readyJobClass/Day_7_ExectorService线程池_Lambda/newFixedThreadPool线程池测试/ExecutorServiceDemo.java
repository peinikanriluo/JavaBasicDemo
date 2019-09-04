package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.newFixedThreadPool线程池测试;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mr = new MyCallable();
        ExecutorService ser = Executors.newFixedThreadPool(4);
        System.out.println(ser.submit(mr).get());
        System.out.println(ser.submit(mr).get());
        System.out.println(ser.submit(mr).get());
        System.out.println(ser.submit(mr).get());
        System.out.println("_________________________________");
     ser.shutdown();
    }
}

class MyCallable implements Callable {

    private int times = 0;
    private String s = "号low比回来了";
    Lock lo =new ReentrantLock();

    @Override
    public String call() throws Exception {
        times++;
        lo.lock();
        if(times==1){
        System.out.println(Thread.currentThread().getName()+"开始战斗,并说出:"+"\r\nI need a girl");
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My girl " + Thread.currentThread().getName() + " is come!!");
        System.out.println(Thread.currentThread().getName()+"说出:We are family");
            System.out.println(Thread.currentThread().getName()+"   执行任务完成,返回main航母");
        lo.unlock();
        return Thread.currentThread().getName()+"号帅逼潇洒的回家了,并带着一堆女朋友";
    }else {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"成功打完酱油,返回main航母");
            lo.unlock();
            return Thread.currentThread().getName()+s;}
}
}
