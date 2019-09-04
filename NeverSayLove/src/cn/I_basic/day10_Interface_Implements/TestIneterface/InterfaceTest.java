package cn.I_basic.day10_Interface_Implements.TestIneterface;

public interface InterfaceTest {
    //接口不能直接创建对象,需要用一个子类去实现.
    public static final int A =34;//大写,不可改变
    public abstract void method1();//抽象方法,需要子类实现
    public abstract void method2();//或者自己变接口
    public default void method3(){
        System.out.println("接口方法3已运行");
    }
    public default void method4(){
        System.out.println("接口默认方法method4已执行,并且执行0,1,2,3");
        method0();
        method1();
        method2();
        method3();
    }
    public static void method0(){
        System.out.println("不该执行的静态方法0已经执行");
    }
}
