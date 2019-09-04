package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.Lambda表达式在线程池中;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CallableTicketDemo {
    public static void main(String[] args) {
        Lock lo = new ReentrantLock();
        Runnable r = new Runnable() {
            int num = 1000;

            @Override
            public void run() {
                while (true) {
                    lo.lock();
                    if (num >= 0) {
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
            }
        };
       /* Callable r = () -> {
            int num = 100;//没办法给位置定义在成员位置,很尴尬,无法完成多线程执行买票的单任务
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
        return null;
        };*/
//        FutureTask<String> fu=new FutureTask<String>(r1);
        /*Thread t1 = new Thread(fu);
        t1.setName("此时一11号窗口");
        Thread t2 = new Thread(fu);
        t2.setName("此时二22222222号窗口");
        Thread t3 = new Thread(fu);
        t3.setName("此时三333333333333333号窗口");*/
        //使用线程池之后就不需要直接手动创建Thread的对象了,只不过线程池名字不可以自定义
        ExecutorService ser = Executors.newFixedThreadPool(4);
        ser.submit(r);
        ser.submit(r);
        ser.submit(r);
        ser.submit(r);
        ser.shutdown();
    }
}