package cn.III_extends_program.并发编程视频.线程安全三问题;

/**
 * @Author: sunset
 * @Date: 2019/9/21 15:03
 * @Description: cn.III_extends_program.并发编程视频.线程安全三问题
 */
public class 原子性 {
        // 无法再多线程情况下实现原子递增
    volatile static  int count = 0;
    public static void inc(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(原子性::inc).start();
        }
        Thread.sleep(3000);
        System.out.println("运行结果:"+count);
        System.out.println("无法再多线程情况下实现原子递增");
    }
}
