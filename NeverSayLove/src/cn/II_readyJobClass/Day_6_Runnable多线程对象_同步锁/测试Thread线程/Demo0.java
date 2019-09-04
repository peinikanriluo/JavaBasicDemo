package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.测试Thread线程;

public class Demo0 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        t1.start();


        while (true){
            System.out.println("正在看视频--------");
        }


    }
}
