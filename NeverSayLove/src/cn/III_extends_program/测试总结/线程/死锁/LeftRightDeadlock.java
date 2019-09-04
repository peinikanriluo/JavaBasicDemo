package cn.III_extends_program.测试总结.线程.死锁;

public class LeftRightDeadlock {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        // 得到left锁
        synchronized (left) {
            // 得到right锁
            synchronized (right) {
                System.out.println("hello leftRight锁?");
            }
        }
    }

    public void rightLeft() {
        // 得到right锁
        synchronized (right) {
            // 得到left锁
            synchronized (left) {
                System.out.println("hello rightLeft锁!");
            }
        }
    }
}