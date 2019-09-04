package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {

        //java.lang.IllegalMonitorStateException
        // 非法的监视器状态异常,需要是  同步锁对象
        Object obj = new String();
//        synchronized(obj){
        obj.wait();
            System.out.println("nihaoya");
//    }


    }

}
