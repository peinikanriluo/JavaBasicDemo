package cn.I_basic.day10_Interface_Implements;

public class Run  {
    public static void main(String[] args) {
        Animal a = new Dog();
        //编译看左边,运行看右边 实际运行的时候这里的a还是Cat类型[new Cat()]
        // 编译器自动判定所使用方法是否是声明类型中的父类所没有的方法,没有报错
        if(a instanceof Dog){
            ((Dog)a).eat();
        }
        if (a instanceof Cat){
            ((Cat)a).eat();
        }
    }

    public static class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println("狗狗吃啥呢");
        }
    }

    public static class Cat extends Animal{
        @Override
        public void eat() {
            System.out.println("猫在吃饭呀!!");
        }
    }

    public abstract static class Animal {//抽象类的实现
        public abstract void eat();



    }
}
//所以只会执行子类重写后的方法喽,因为子类无条件使用父类
//非私有内容,所以只有在转向父类其他子类时才会出错