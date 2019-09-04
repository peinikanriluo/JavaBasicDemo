package cn.III_extends_program.线程.TreadLocal线程局部变量;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author taoqi
 * @date 2019/8/6
 * ThreadLocal 测试各个线程
 */
public class TestThreadContext {
    public static void main(String[] args) {
        ThreadContext threadContext = new ThreadContext();
        ExecutorService es = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 7; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    threadContext.setUserId("tq-->地址: "+threadContext.get());
                    System.out.println("threadContext.get() = " + threadContext.getUserId());
                }
            });
        }
        threadContext.setUserId("main进程地址 :"+threadContext.get());
        System.out.println("threadContext.get() = " + threadContext.getUserId());
        es.shutdown();
    }
}
