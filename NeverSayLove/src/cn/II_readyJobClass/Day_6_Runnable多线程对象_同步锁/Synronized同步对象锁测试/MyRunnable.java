package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Synronized同步对象锁测试;

public class MyRunnable implements Runnable {

    int i = 0;
    @Override
    public void run() {
        Object o = new Object();

        synchronized (o) {

            for(;i<100;){

            System.out.println(Thread.currentThread().getName()+ "进程正在通过山洞"+i);
            i++;
        }}
    }
}