package cn.I_basic.day6_Object.CatDog;


public class Test {
    public static void main(String[] args) {
        Cat love =new Cat ();
        love.setBreed("罗小黑");
        love.setColor("纯黑的");
        love.color="花色的";
        love.breed = "波斯猫";
//不符合标准的Java Bean；标准的Java Bean中的成员变量是需要封装的
        love.eat();
        love.catchMouth();
        System.out.println("=======================");
        Cat hate = new Cat();//创建了新的对象以前对象的数据全部不见
        hate.eat();
        hate.catchMouth();
       Dog like = new Dog();
//        like.color = "黑色的";
//        like.breed= "藏獒";

//        like.setBreed("小灰");
//        like.setColor("灰色的");
//        like.eat();
//        like.work();
        }
}
