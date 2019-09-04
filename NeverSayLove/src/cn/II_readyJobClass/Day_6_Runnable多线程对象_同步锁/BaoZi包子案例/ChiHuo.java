package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.BaoZi包子案例;

public class ChiHuo extends Thread {

    BaoZi bz;
    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }
    @Override
    public void run() {

        while(true){
            synchronized (bz){
                if(!bz.isHave){
                    //没包子,就等
//                    return;
                    try {
                        bz.wait(); //当前进入无限等待 (1.释放锁 2.停止获取cpu执行权)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.err.println("吃货正在吃包子...");
                bz.isHave = false;
                bz.notify();
            }


        }

    }
}
