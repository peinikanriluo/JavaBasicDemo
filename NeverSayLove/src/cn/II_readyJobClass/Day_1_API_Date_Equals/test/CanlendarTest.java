package cn.II_readyJobClass.Day_1_API_Date_Equals.test;

import java.text.ParseException;
import java.util.Calendar;

public class CanlendarTest {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();//抽象类利用静态方法创造了对象
        c.add(Calendar.DAY_OF_MONTH,5);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
    }
}
