package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Runable接口测试;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"   ------------------ "+i);
        }
    }
}
