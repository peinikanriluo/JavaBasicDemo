package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.死锁;

public class Suo1 extends Thread{
    Object o;Object o1;
    public Suo1(Object o,Object o1) {
        this.o = o;
        this.o1 = o1;

    }


    public void run (){
        synchronized(o) {
            for(int i = 20;i>0;i--) {
                System.out.println("锁111111111111111111111正在霸屏------------------------------------");
            }
            System.out.println("锁1成功脱离第一把锁");
        synchronized (o1){
            for(int i = 20;i>0;i--) {
                System.out.println("锁111111111111111111111正在霸屏------------------------------------");
            }
            System.out.println("锁1成功脱离第二把锁");

        }

        }
    }
}
