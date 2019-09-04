package cn.II_readyJobClass.Day_5_异常检测.父类子类抛异常测试;

public class ZiClass extends FuClass {
    public static void main(String[] args) /*throws Exception*/ {
        ZiClass z = new ZiClass();
        try {
            z.methodFu();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void methodZi() /*throws Exception*/{
        //父类抛出异常,子类可抛可不抛,,但父类不抛出异常,子类不可抛异常,只能捕获或者是父类属于运行时异常可选择不管不顾
        int [] a = null;
        System.out.println("子类运行");
    }
}
