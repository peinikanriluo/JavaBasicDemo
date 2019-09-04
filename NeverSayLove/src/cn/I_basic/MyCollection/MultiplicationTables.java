package cn.I_basic.MyCollection;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        System.out.println("请输入乘法表最大值");
        int a = mul.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1 + "*" + i + "=" + (i1 * i) + "  ");
            }
            System.out.println();
        }
    }
}
