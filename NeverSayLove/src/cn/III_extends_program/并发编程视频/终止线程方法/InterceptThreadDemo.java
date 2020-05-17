package cn.III_extends_program.并发编程视频.终止线程方法;

/**
 * @Author: sunset
 * @Date: 2019/9/21 17:03
 * @Description: cn.III_extends_program.并发编程视频.终止线程方法
 */
public class InterceptThreadDemo {
    private static int i ;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) { // 需要以此为条件
                    i++;
                }
            }
        });
        thread.start();
        Thread.sleep(5000);
//        thread.stop();
        thread.interrupt();
        System.out.println("i = " + i);
    }
}
