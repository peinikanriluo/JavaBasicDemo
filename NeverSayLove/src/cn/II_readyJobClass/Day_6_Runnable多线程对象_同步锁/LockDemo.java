package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        MyTask mt = new MyTask();

        Thread t1 = new Thread(mt);
        t1.setName("窗口壹");
        Thread t2 = new Thread(mt);
        t2.setName("窗口二二二");
        Thread t3 = new Thread(mt);
        t3.setName("窗口333333333333");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyTask implements Runnable{
    private int number = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(number > 0){
            lock.lock();
            if(number <= 0){  //二重判断
                lock.unlock();
                break; // 不会自动释放
            }
            System.out.println(Thread.currentThread().getName() + "正在卖出" + number + "张票");
            number--;
            lock.unlock();
        }
    }
}

