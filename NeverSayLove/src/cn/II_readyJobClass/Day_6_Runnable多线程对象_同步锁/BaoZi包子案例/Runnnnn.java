package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.BaoZi包子案例;

public class Runnnnn {
    public static void main(String[] args) {

            BaoZi bz = new BaoZi();
            ChiHuo ch = new ChiHuo(bz);
            BaoZiPu bzp = new BaoZiPu(bz);

            ch.start();
            bzp.start();

    }
}
