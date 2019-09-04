package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.死锁;

public class Suo2 extends Thread {
    Object o;
    Object o1;

    public Suo2(Object o,Object o1) {
        this.o = o;
        this.o1 = o1;

    }
    public void run(){
        synchronized(o1){
            for (int i = 20;i>0;i--){
                System.out.println("锁2222222222222222222正在霸屏中----------------------------------------------");
            }
            System.out.println("锁2成功脱离第一把锁锁");
        synchronized(o) {
            for(int i = 20;i>0;i--) {
                System.out.println("锁2222222222222222222222222正在霸屏------------------------------------");
            }
            System.out.println("锁2成功脱离第二二二二二把锁");
        }

        }

    }

}
