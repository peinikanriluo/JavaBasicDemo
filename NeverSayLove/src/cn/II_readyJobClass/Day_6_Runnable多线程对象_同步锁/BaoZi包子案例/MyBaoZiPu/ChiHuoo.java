package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.BaoZi包子案例.MyBaoZiPu;

public class ChiHuoo extends Thread {
    BaoZii bz;

    public ChiHuoo(BaoZii bz) {
        this.bz = bz;
    }

    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.isHave) {
                    System.out.println("吃货在吃包子啦");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.isHave = true;
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("包子吃没了,老板快做");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.notify();
                    bz.isHave = true;
                }
            }

        }
    }

}

