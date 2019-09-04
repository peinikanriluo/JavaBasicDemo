package cn.II_readyJobClass.Day_1_API_Date_Equals;

import java.util.Date;

public class DateUtilClass {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println("a = " + a);
        System.out.println(a.getTime());//1553911237133
        a.setTime(1553911237133l);
        System.out.println("a = " + a);

    }
}
