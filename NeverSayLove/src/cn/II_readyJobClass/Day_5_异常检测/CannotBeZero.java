package cn.II_readyJobClass.Day_5_异常检测;

import java.util.Scanner;


public class CannotBeZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("别输入0");
        int a = 1;
        try {
            a = s.nextInt();
            method0(a);
        } catch (Exception e) {
            System.err.println("捕捉错误");
        }
        System.out.println(a);
    }


    private static void method0(int i) throws Exception {
        if (i == 0) {
            throw new NullPointerException();
        } else System.out.println("此数可用");
    }


}
