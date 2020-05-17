package cn.III_extends_program.线程.拔高视频.定时器;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: sunset
 * @Date: 2019/9/12 0:48
 * @Description: cn.III_extends_program.线程.拔高视频.回顾线程创建
 */
public class TraditionalTimerDemo01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始计时!!!");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("booming");
//                timer.cancel(); // 关闭定时器
            }
        },5000,1000);
            // 定时 五秒爆炸 , 之后每一秒炸一次
        int i=0;
        System.out.println("证明定时器是 线程!");
        while (true) {
            System.out.println(++i);
            Thread.sleep(1000);
        }
    }
}
