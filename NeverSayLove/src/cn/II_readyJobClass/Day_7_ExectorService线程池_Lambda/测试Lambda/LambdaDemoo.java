package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.测试Lambda;

public class LambdaDemoo {
    public static void main(String[] args) {
        new Thread((/*定义变量的位置*/)-> {System.out.println("多任务执行");}).start();
    }
}

class MyRunnableTestt {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程任务执行");
            }
        };
        new Thread(r).start();

        //Lambda表达式的扩写
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我又tm执行lia");
            }
        }).start();
    }
}