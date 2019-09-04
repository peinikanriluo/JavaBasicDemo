package cn.II_readyJobClass.Day_5_异常检测.自定义异常_登录异常;


import java.util.HashMap;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
            HashMap map = new HashMap();
        for(;;) {
            System.out.println("请输入学生姓名和年龄");
            Scanner s = new Scanner(System.in);
            Student stu = new Student(s.next(), s.nextInt());
            if(stu.getAge()<0) {
                try {
                    throw new AgeException("年龄不能为负数");
                } catch (AgeException a) {
                    a.printStackTrace();
            }
                }else{
                System.out.println("以保存");
                map.put(stu.getName(),stu.getAge());
                }
        System.out.println(map);
        }
    }
}
