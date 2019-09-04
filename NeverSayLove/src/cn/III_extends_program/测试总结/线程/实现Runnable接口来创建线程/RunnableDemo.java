package cn.III_extends_program.测试总结.线程.实现Runnable接口来创建线程;

public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new MyThread(),"线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("啦啦");
            }
        },"线程2").start();
    }
}

/**
 * 实现 Runnable 接口的线程类
 */
class MyThread implements Runnable{
    /** 
     * 重写run方法
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("呵呵");
    }
}
