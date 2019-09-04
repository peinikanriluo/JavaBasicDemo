package cn.I_basic.day10_Interface_Implements.TestIneterface;

public class Run {
    public static void main(String[] args) {
        InterfaceTest a = new InterfaceTestImplements() {};
        a.method4();//a.method0();对象直接调用静态方法.
        //事实上编译器会查看method4的声明类型InterfaceTest是否含有此方法
        //而运行时实会直接在实际类型InterfaceTestImplement中调用方法.
        //也就是多态情况下多态父类不能调用子类的特有方法
        InterfaceTest.method0();//接口名调用静态方法.
        InterfaceTestImplements.method0();//子类类名调用静态方法
        ((InterfaceTestImplements)a).sleep();//强转对象调用对象类方法
    }
    //首先,对象本质上是不能调用静态方法的,所以在多态中编译器会直接将对象改为声明类型.
}
