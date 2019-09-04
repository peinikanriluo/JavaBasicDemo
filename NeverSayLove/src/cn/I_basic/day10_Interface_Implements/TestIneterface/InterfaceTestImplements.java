package cn.I_basic.day10_Interface_Implements.TestIneterface;

public class InterfaceTestImplements extends supreme implements InterfaceTest,InterfaceTestInterface {

   public void sleep(){
        System.out.println("low比类调用继承supreme类中的睡觉");
    }
    public static void method0(){
        System.out.println("多态时无法执行的静态方法0已经执行");
    }
    //因为多态中调用静态方法使用声明类型的
}
