package cn.III_extends_program.测试总结.基础拓展.Timer定时器_了解;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//要求：使用定时器,间隔 4 秒执行一次，再间隔 2 秒执行一次，以此类推执行。

class TimerTastCus extends TimerTask {
    @Override
    public void run() {
        count = (count + 1) % 2;
        System.err.println("Boob boom ");
        new Timer().schedule(new TimerTastCus(), 2000 + 2000 * count);
    }
    //PS：下面的代码中的 count 变量中 //此参数要使用在你匿名内部类中，使用 final 修饰就无法对其值进行修改，
// 只能改为静态变量
    private static volatile int count = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new  TimerTastCus(), 2000 + 2000 * count);
        while (true) {
            System.out.println(new Date().getSeconds());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

