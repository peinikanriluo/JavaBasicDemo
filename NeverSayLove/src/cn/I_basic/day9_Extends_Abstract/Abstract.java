package cn.I_basic.day9_Extends_Abstract;

abstract class Animal {
    public abstract void run();
}

class Cat extends Animal {//子类对父类抽象方法重写,即实现
    public void run() {
        System.out.println("小猫在墙头走~~~");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // 创建子类对象
        Cat c = new Cat();

        // 调用run方法
        c.run();
    }
}


