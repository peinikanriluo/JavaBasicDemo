package cn.I_basic.MyCollection;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);
        for (int i = 0; 1 < 2; i++) {
//            double a = calculate.nextDouble();
//            double b = calculate.nextDouble();
            System.out.println("演示两个数的加法");
            System.out.println("请输入两个数");
            System.out.println("a+b=" + (calculate.nextDouble() + calculate.nextDouble()));
            System.out.println("演示两个数的减法");
            System.out.println("请输入两个数");
            System.out.println("a-b=" + (calculate.nextDouble() - calculate.nextDouble()));
            System.out.println("演示两个数的乘法");
            System.out.println("请输入两个数");
            System.out.println("a*b=" + (calculate.nextDouble() * calculate.nextDouble()));
            System.out.println("演示两个数的除法");
            System.out.println("请输入两个数");
            System.out.println("a/b=" + calculate.nextDouble() / calculate.nextDouble());
        }
    }
}