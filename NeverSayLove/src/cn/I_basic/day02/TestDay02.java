package cn.I_basic.day02;

public class TestDay02 {
    public static void main(String[] args) {
        //判断字符是否为数字字符
        char a = '6';
        boolean a1 = a >= '0' && a <= '9';
        System.out.println("判断是否为数字字符：" + a1);
        //  判断是否闰年
        int years = 2024;
        boolean yunnian = years % 4 == 0;
        System.out.println("判断是否为闰年=" + yunnian);
        //  水仙数：水仙花是指3位数字，表示的是每位上的数字的3次
//  幂相加之后的和值和原数相等，则为水仙花数
        int b = 153;
        int b100 = b / 100, b10 = b % 100 / 10, b1 = b % 10;
        int num = b100 * b100 * b100 + b10 * b10 * b10 + b1 * b1 * b1;
        System.out.println("判断三位数是否为水仙数：" + (num == b));
        //        5位数拆分各个位数
        int h = 12345, w = 0, q = 0, s = 0, g = 0;
        for (int i = 10000; i >= 1; i /= 10) {
            int i5 = h / i % 10;
            if (i == 10000) w = i5;
            if (i == 1000) q = i5;
            if (i == 10) s = i5;
            if (i == 1) g = i5;
        }
        System.out.println("判断万位和个位是否相等：" + (w == g));
        System.out.println("判断千位和十位是否相等：" + (q == s) + "\r\n所输五位数值为：");
        int[] arrayA = {1, 2, 3, 2, 1};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i]);
        }
        System.out.println("\r\n" + "依次判断万个位和千百位是否相等：\r\n" + (arrayA[0] == arrayA[4]));
        System.out.println(arrayA[1] == arrayA[3]);
    }
}