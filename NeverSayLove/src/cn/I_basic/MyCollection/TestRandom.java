package cn.I_basic.MyCollection;// 导入随机数工具包

import java.util.Random;
import java.util.Scanner;

// 演示随机数
public class TestRandom {
    public static void main(String[] args) {
        // 创建随机数生成器
        Random r = new Random();
        Scanner ran = new Scanner(System.in);
        int random = ran.nextInt();
        /*
            通过随机数生成器生成随机数
            nextInt(100);是指产生0-100之间的随机数据
            如果想要产生其他范围的随机数，只要改变()中的参数，或通过简单的运算完成。
        */
        int random_number = r.nextInt(random);

        // 打印产生的随机数
        System.out.println("random_number = " + random_number);
    }
}