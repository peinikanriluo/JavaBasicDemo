package cn.I_basic.day04_Method;

public class fangfashifougaibianbianliang {
    public static void main(String[] args) {
        int a=1;
        Method(a);
        System.out.println(a);

    }

    public static void Method(int a) {
        a=1999;
    }
}
//方法中的a只是算赋值过来，不赋值调用的话主方法中的a是不变的。
//简单说下面a是过了作用域就无效了
