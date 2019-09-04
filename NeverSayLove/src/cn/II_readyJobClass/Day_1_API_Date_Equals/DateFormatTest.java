package cn.II_readyJobClass.Day_1_API_Date_Equals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat d = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
        Date da = new Date();
        System.out.println(d.format(da));
        Date testParse = d.parse(d.format(da));
        System.out.println(testParse);
    }
}
