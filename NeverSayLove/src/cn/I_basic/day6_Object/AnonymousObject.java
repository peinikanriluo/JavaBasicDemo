package cn.I_basic.day6_Object;


import java.util.Scanner;
class woai{
    String name = "wpq";
    int age = 24;


    public String sorry(String name){
        this.name = name;
        return name;
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        System.out.println("new HashMap_table键值能否为null(System.in).next(int) = " + new Scanner(System.in).nextInt());
        //Scanner类型System.out.print也能打印。
        woai ni = new woai();
        System.out.println(ni.sorry("duibuqi"));
        //此方法没有返回值 ，也就无法打印
        System.out.println("woai.name = " + ni.sorry("wpq"));
    }
}
