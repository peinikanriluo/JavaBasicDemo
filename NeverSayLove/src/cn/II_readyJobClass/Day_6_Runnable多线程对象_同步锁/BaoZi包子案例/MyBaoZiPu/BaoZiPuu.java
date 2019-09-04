package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.BaoZi包子案例.MyBaoZiPu;

public class BaoZiPuu extends Thread {
    BaoZii bz;

    public BaoZiPuu(BaoZii bz) {
        this.bz = bz;
    }

    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.isHave) {
                    System.out.println("等待顾客吃包子");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.notify();
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了,顾客快来吃饱饱");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.isHave = false;
                    bz.notify();
                }
            }

        }
    }

}
