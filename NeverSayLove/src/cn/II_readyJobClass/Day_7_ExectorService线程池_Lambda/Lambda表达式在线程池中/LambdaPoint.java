package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.Lambda表达式在线程池中;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LambdaPoint {
    public static void main(String[] args) {

        Lock lo = new ReentrantLock();
        Runnable r1 = new Runnable() {
            int num = 100;
            @Override
            public void run() {
                while (true) {
                    lo.lock();
                    if (num >= 0) {
                        if (num == 0) {
                            lo.unlock();
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "正在买票" + num);
                        num--;
                        lo.unlock();//不自动解锁
                    }
                }
            }
        };
        /*Runnable r1 = () -> {
            int num = 100;
            {
                //使用Lambda表达式在Runnable中能共用r1对象,不能实现多线程执行买票的单任务,那是因为你num的位置定义不能在成员位置.
                while (true) {
                    lo.lock();
                    if (num >= 0) {
                        if (num == 0) {
                            lo.unlock();
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "正在买票" + num);
                        num--;
                        lo.unlock();//不自动解锁
                    }
                }
            }
        };*/
        Thread t1 = new Thread(r1);
        t1.setName("此时一11号窗口");
        Thread t2 = new Thread(r1);
        t2.setName("此时二22222222号窗口");
        Thread t3 = new Thread(r1);
        t3.setName("此时三333333333333333号窗口");
        t1.start();
        t2.start();
        t3.start();


    }
}
