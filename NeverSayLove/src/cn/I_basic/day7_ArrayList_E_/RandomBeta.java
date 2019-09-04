package cn.I_basic.day7_ArrayList_E_;

import java.util.Random;
import java.util.Scanner;

public class RandomBeta {
    public static void main(String[] args) {
        Scanner sa = new Scanner("你好");
        Random ra = new Random();
        int b = ra.nextInt(101);
        System.out.println("请输入100以内的数值");
        for (; ; ) {
            int a = sa.nextInt();
            if (a < b) System.out.println("您输入的数值太小");
            else if (a > b) System.out.println("您输入的数值太大");
            else {
                System.out.println("恭喜你答对了");
                break;
            }
        }
    }
}
