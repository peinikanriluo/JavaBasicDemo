package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.死锁;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o = new Object();
        Suo1 s1 = new Suo1(o,o1);
        Suo2 s2 = new Suo2(o,o1);
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.submit(s1);
        e.submit(s2);
        e.shutdown();
        /*一个线程持有锁1并且申请获得锁2，而另一个线程持有锁2并且申请获得锁1。
        并不是必然发生的，但发生就停不了。*/
    }
}
