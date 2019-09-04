package cn.III_extends_program.测试总结.基础拓展.日期;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @version V1.0
 * @author: tq
 * @date: 2019/7/24
 * @description: JavaProject
 */
public class LocalDataTest {
    public static void main(String[] args) {
        //获取月份
        System.out.println(LocalDate.now().getMonth());
        //获取当天周几
        System.out.println(LocalDate.now().getDayOfWeek());
        int week = LocalDate.now().getDayOfWeek().getValue();
        System.out.println(LocalDate.now().getDayOfWeek().minus(week-1));
        // 获取日期 格式 : 2019-07-24
        System.out.println(LocalDate.now());
        //获取当天月份
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM")));
//        System.out.println(new Date());
        System.out.println(LocalDate.now());
    }
}
