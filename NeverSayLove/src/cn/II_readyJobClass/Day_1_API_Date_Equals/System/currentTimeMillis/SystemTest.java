package cn.II_readyJobClass.Day_1_API_Date_Equals.System.currentTimeMillis;

import java.util.Date;

public class SystemTest {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("i = " + i);
        }
        long s2 = new Date().getTime();
        System.out.println(s2-s1);
    }
}
