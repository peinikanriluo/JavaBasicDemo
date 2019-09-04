package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.Lambda表达式在线程池中;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NewRunnableInterface {
    public static void main(String[] args) {

        Runnable run = new Runnable() {
            Object o = new Object();
            Lock lock = new ReentrantLock();
            int m = 500;//需要定义在成员位置
            @Override
            public void run() {

                while (true) {
                    lock.lock();
                    if (m > 0) {
                        System.out.println(Thread.currentThread().getName()+"多线程任务执行" + m);
                        m--;
                    } else {
                        lock.unlock();
                        break;
                    }
                    lock.unlock();
                }
            }
        };

        Lock lo = new ReentrantLock();
        Runnable ru = () ->{  int m = 500;//Lambda方法没法定义Rannable借口成员变量,所以多线程买票的单任务做不了
            while (true) {
                lo.lock();
                if (m > 0) {
                    System.out.println(Thread.currentThread().getName()+"Lambda多线程任务执行" + m);
                    m--;
                } else {
                    lo.unlock();
                    break;
                }
                lo.unlock();
            }
        };
        new Thread(run).start();
        new Thread(run).start();
//        new Thread(ru).start();
//        new Thread(ru).start();

    }
}
