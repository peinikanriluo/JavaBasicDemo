package cn.II_readyJobClass.Day_1_API_Date_Equals.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date d = s.parse("1992-10-20");
        String st = s.format(d);
        System.out.println(d.getTime());
    }
}
