package cn.II_readyJobClass.Day_6_Runnable多线程对象_同步锁.Ticket三窗口卖火车票案例;

public class Demoooo {
    public static void main(String[] args) {
        MyTask mt = new MyTask();

        Thread t1 = new Thread(mt);
        t1.setName("窗口壹");
        Thread t2 = new Thread(mt);
        t2.setName("窗口二二二");
        Thread t3 = new Thread(mt);
        t3.setName("窗口333333333333");

        t1.start();
        t2.start();
        t3.start();
    }
}

 class MyTask implements Runnable{
    static int number = 100;
    @Override
    public void run() {
        while(number > 0){
            method(number);
        }
    }

    private static /*小瞎子*/synchronized  void method(int number) {//获取锁对象
        if(number <= 0){  //二重判断
//            break; // 放在循环和switch 语句
            return;
        }
        System.out.println(Thread.currentThread().getName() + "正在卖出" + number + "张票");
        number--;
    } //释放锁对象
}

