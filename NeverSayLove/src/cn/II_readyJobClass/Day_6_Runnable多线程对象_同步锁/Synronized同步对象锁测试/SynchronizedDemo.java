package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Synronized同步对象锁测试;

public class SynchronizedDemo {
    public static void main(String[] args) {
      MyRunnable my = new MyRunnable();
      Thread t1 = new Thread(my);
      t1.setName("一号车");
      Thread t2 = new Thread(my);
        t2.setName("二号车");
      Thread t3 = new Thread(my);
        t3.setName("三号车");
      t1.start();
      t2.start();
      t3.start();

    }
}
