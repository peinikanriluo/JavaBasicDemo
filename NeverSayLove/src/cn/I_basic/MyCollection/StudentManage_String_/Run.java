package cn.I_basic.MyCollection.StudentManage_String_;


import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ArrayList<StudentInfo> info = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (; ; ) {
            System.out.println("--------------------欢迎来到学生管理系统,请选择-------------------\r\n" + "" +
                    "1  查看所有学生\r\n" + "2  添加学生\r\n" + "3  删除" +
                    "学生\r\n" + "4  修改学生\r\n" + "5  退出\r\n" + "请输入你的选择:");
            StudentInfo i = new StudentInfo();
            String a = s.next();
            if (a.equals("1")) {
                 Me.reviewStudent(info);

            } else if (a.equals("2")) {
                 Me.addStudent(info, i);

            } else if (a.equals("3")) {
                 Me.delStudent(info, i);

            } else if (a.equals("4")) {
                 Me.changeStudent(info, i);

            } else if (a.equals("5")) {
                System.out.println("程序已退出");
                break;

            } else System.out.println("输入有误");

        }
    }
}
