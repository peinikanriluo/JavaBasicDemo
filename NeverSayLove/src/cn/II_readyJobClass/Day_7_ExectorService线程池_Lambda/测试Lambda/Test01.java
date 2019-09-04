package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.测试Lambda;

public class Test01  {
    public static void main(String[] args) {
        methodd();
        Interfaceeeeee i =()-> System.out.println("Lampda表达式只能允许接口中存在一个抽象方法");//不能用于抽象类
        i.abc();
        new Thread(()-> System.out.println("Lampda表达式作为Rannable执行") ).start();

    }

    private static void methodd() {
        Interfaceeeeee i =new Interfaceeeeee(){

            @Override
            public void abc() {
                System.out.println("abc执行");
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable执行新的线程");
            }
        }).start();
    }

}
