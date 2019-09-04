package cn.II_readyJobClass.Day_1_API_Date_Equals;

import java.util.Calendar;


public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());//Canlendar中的getTime()是获取Date对象
        System.out.println(c.get(1));
    }
}
