package cn.I_basic.day6_Object;

class Telephone {
    String brand="qishi";
    double price;
    String color;

    public void call() {
        System.out.println("大你大爷");
    }
}


public class ObjectArgs {
    //用对象类型作为方法的参数
    public static void main(String[] args) {
        Telephone one = new Telephone();
        one.brand = "苹果";
        System.out.println( new Telephone().brand="苹果");
        System.out.println(one.brand);
        one.price = 8838.0;
        one.color = "土豪金";
        System.out.println(one);//这里的one是地址值；是存在与栈内存中的局部变量
        one.call();
    }

    public static void method(Telephone a) {//使用自定义的类作为参数
//        即使用对象类型作为方法的参数。
        System.out.println(a.brand);
        System.out.println(a.price);
        System.out.println(a.color);
    }
}
