package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁;

public class SleepDemo {


        public static void main(String[] args)  {
            //让当前线程 睡眠 3000ms
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("哈哈");
        }
    }


