package cn.III_extends_program.并发编程视频.线程安全三问题;

import java.util.concurrent.TimeUnit;

/**
 * @Author: sunset
 * @Date: 2019/9/21 14:57
 * @Description: cn.III_extends_program.并发编程视频.线程安全三问题
 */
public class 可见性 {
    private volatile static boolean stop =false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
            }
            System.out.println("yes-->volatile使得线程可见:: i="+i);
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1); // 一秒钟
        stop=true;

    }
}
