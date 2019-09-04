package cn.I_basic.homework.String字符串;

import java.util.Scanner;

public class Day8PlusChar {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        String qi1 = sa.next();
        nima(qi1);
    }
    public static void nima(String qi1){
        String str = "";
        for(int  i=qi1.length()-1;i>=0;i--){
            str+=qi1.charAt(i);
        }
        System.out.println("str = " + str);
    }
}
