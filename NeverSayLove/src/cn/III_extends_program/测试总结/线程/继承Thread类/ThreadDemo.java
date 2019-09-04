package cn.III_extends_program.测试总结.线程.继承Thread类;

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyThread(), "线程2").start();
    }
}
class MyThread extends Thread{

    /** 
     * 重写run方法
     */
     @Override
     public void run() {
         // TODO Auto-generated method stub
         System.out.println("呼呼");
         super.run();
     }
}
