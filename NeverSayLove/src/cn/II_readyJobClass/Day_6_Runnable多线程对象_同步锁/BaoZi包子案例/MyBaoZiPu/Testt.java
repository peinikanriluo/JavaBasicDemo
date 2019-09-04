package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.BaoZi包子案例.MyBaoZiPu;

public class Testt  {
    public static void main(String[] args) {
        BaoZii bz = new BaoZii();
        BaoZiPuu bzp = new BaoZiPuu(bz);
        ChiHuoo ch = new ChiHuoo(bz);

        bzp.start();
        ch.start();
    }
}
