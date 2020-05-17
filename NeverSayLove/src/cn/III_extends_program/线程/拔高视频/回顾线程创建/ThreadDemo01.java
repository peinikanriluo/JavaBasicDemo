package cn.III_extends_program.线程.拔高视频.回顾线程创建;

/**
 * @Author: sunset
 * @Date: 2019/9/12 0:25
 * @Description: cn.III_extends_program.线程.拔高视频.回顾线程创建
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
     // 继承
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true){
                    System.out.println("实现--当前线程:"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //启动
        thread.start();

        // 使用 宿主 Runnable对象启动
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("宿主--当前线程:" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
    }
}
