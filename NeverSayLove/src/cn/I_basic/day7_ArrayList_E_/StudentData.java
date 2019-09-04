package cn.I_basic.day7_ArrayList_E_;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("请输入第一位受害者姓名年龄");
            Scanner data = new Scanner(System.in);
            Student s = new Student(data.next(), data.nextInt());//根据.next（）；.nextInt（）直接判断输入类型
            System.out.println("请输入第二位受害者姓名年龄");
            Scanner data2 = new Scanner(System.in);
            Student t = new Student(data2.next(), data2.nextInt());
            System.out.println("请输入第三位受害者姓名年龄");
            Scanner data3 = new Scanner(System.in);
            Student u = new Student(data3.next(), data3.nextInt());
//        String name = ;
//        int age = ;
            ArrayList<Student> one = new ArrayList<>();
            one.add(s);
            one.add(t);
            one.add(u);
//        one.set(0,s);
            System.out.println("名字:" + s.getName() + "，年龄:" + s.getAge());
            System.out.println("名字:" + t.getName() + "，年龄:" + t.getAge());
            System.out.println("名字:" + u.getName() + "，年龄:" + u.getAge());

        }
    }
}