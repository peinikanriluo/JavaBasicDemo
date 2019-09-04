package cn.I_basic.day10_Interface_Implements.TestIneterface;

public abstract class supreme {
    public void method1() {
        System.out.println("方法一已实现");
    }
    public void method2() {
        System.out.println("方法二已实现");
    }
    public void method3(){
        System.out.println("子类重写接口中<<相同的>>默认方法3");
    }
    //父类帮子类重写子类要实现的接口方法
}
