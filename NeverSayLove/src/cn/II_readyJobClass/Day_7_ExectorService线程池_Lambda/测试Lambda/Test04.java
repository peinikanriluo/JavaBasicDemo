package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.测试Lambda;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        lower((a,b)->{
            int minus;
            minus = Math.abs(a-b);
            System.out.println(minus);
            return minus;
        });
    }
    public static void lower(Calculator cal){
        Scanner s = new Scanner(System.in);
        System.out.println("输入两个整型数字");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("两数之差绝对值是是:"+cal.cut(a, b));
    }
}
interface Calculator{
    public int cut(int a ,int b);
}