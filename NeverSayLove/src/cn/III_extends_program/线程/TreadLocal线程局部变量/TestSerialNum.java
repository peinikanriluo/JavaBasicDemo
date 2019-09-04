package cn.III_extends_program.线程.TreadLocal线程局部变量;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author taoqi
 * @date 2019/8/6
 */
public class TestSerialNum {
    public static void main(String[] args) {
        SerialNum serialNum = new SerialNum();
        System.out.println("主线程执行");
        System.out.println("serialNum.getNum() = " + serialNum.getNum());
        ExecutorService e = Executors.newFixedThreadPool(2);
        Runnable runna = new Runnable() {
            @Override
            public void run() {
                System.out.println("新的线程执行了");
                System.out.println("serialNum.getNum()() = " + serialNum.getNum());
            }
        };
        e.shutdown();
        e.submit(runna);
        System.out.println("线程池关闭");
    }
}
