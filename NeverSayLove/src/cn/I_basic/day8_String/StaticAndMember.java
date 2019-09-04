package cn.I_basic.day8_String;

import java.util.Scanner;

class Phone {
    String name;
    int age;
    static char sex;

    }


public class StaticAndMember {
    public static void main(String[] args) {
        Scanner yxhlk = new Scanner(System.in);
        System.out.println("名字，年龄，性别");
        Phone Q = new Phone();
        Q.name = yxhlk.next();
        Q.age = yxhlk.nextInt();
        Q.sex/*编译器已经自动给Q转成Phone*/ = yxhlk.next().charAt(0);
        System.out.println("Q.age = " + Q.age);
        System.out.println("Q.name = " + Q.name);
        System.out.println("Q.sex = " + Q.sex);
        Phone p = new Phone();//新建对象成员变量方法在堆中地址已经改变，而静态变量在方法静态区
        System.out.println("p.age = " + p.age);
        System.out.println("p.name = " +p.name);
        System.out.println("p.sex = " + p.sex);
}

}
