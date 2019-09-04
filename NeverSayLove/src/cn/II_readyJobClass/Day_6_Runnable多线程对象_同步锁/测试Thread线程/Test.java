package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.测试Thread线程;

public class Test {
    public static void main(String[] args) {
        Mythread mt = new Mythread("新的线程");
        mt.start();
        for (int i = 0; i < 15; i++) {
            System.out.println("main线程!"+i);
        }
    }
}
