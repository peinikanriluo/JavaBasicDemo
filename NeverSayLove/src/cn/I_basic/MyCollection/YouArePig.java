package cn.I_basic.MyCollection;

import java.util.Scanner;

public class YouArePig {
    public static void isme() {
        Scanner input = new Scanner(System.in);
        System.out.println("说你是猪：");
        for (; ; ) {
            String youPig = input.next();
            if (youPig.contains("你是猪")) {
                System.out.println("反弹^v^  难受不狗子");
                System.out.println("\r\n请注意第一人称转换，说你是猪");
            } else if (youPig.contains("我是猪")) {
                System.out.println("真棒");
                break;
            } else {
                System.out.println("不说你就是狗子");
                System.out.println("\r\n三个字那么难打么？再说一次你是猪");
            }
        }
    }

    public static void main(String[] args) {
        isme();
    }
}