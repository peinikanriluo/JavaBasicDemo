package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.BaoZi包子案例;

public class BaoZiPu extends Thread {

    BaoZi bz;
    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.isHave){
                    //有包子,就等被吃
//                return;
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺做包子...");
                bz.isHave = true;
                bz.notify(); // 唤醒等待此锁的线程
            }

        }
    }
}
