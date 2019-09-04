package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.测试Thread线程;

public class Mythread extends Thread{
    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            System.out.println(getName()+"正在执行"+i);

        }
    }

}
