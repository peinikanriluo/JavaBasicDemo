package cn.III_extends_program.线程;

/**
 * @author taoqi
 * @date 2019/8/9
 */
public class ThreadMethods {
    Boolean ziOver = false;
    int overTimes = 0;

    public synchronized void zhuMethod() {
        while (!ziOver) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":主线程执行!" + overTimes);
        }
        ziOver = false;
        notify();
    }

    public synchronized void ziMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":子线程执行!" + overTimes++);
        }
        ziOver = true;
        notify();
        while (ziOver) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
