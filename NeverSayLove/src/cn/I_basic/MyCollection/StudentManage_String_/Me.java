package cn.I_basic.MyCollection.StudentManage_String_;

import java.util.ArrayList;
import java.util.Scanner;
public class Me {
    public static ArrayList<StudentInfo> reviewStudent(ArrayList<StudentInfo> info) {
        Scanner s = new Scanner(System.in);
        if (info.size() == 0) System.out.println("不好意思,目前没有学生信息可供查看,请重新选择你的操作");
        else {

            System.out.println("选择你要查看的学生:");
            for (int i1 = 0; i1 < info.size(); i1++) {
                System.out.println(i1 + ":姓名:" + info.get(i1).getName());
            }
            int ca = s.nextInt();
            if (ca > info.size()) System.out.println("输入有误!!");
            else {
                for (int i1 = 0; i1 < info.size(); i1++) {
                    if (ca == i1) {
                        System.out.println(info.get(i1));
                    }
                }
            }
        }
        return info;
    }

    public static ArrayList<StudentInfo> addStudent(ArrayList<StudentInfo> info, StudentInfo i) {
        Scanner s = new Scanner(System.in);
        System.out.println("正在添加个人信息...");
        System.out.println("请输入学号:");
        i.setNumber(s.next());
        System.out.println("请输入姓名:");
        i.setName(s.next());
        System.out.println("请输入年龄:");
        i.setAge(s.next());
        System.out.println("请输入地址:");
        i.setAddress(s.next());
        info.add(i);
        System.out.println("添加成功,即将回主界面");
        return info;
    }

    public static ArrayList<StudentInfo> delStudent(ArrayList<StudentInfo> info, StudentInfo i) {
        Scanner s = new Scanner(System.in);
        if (info.size() == 0) {
            System.out.println("暂时没有可删除学生,请添加信息.");
        } else {
            System.out.println("选择你要删除的学生:");
            for (int i1 = 0; i1 < info.size(); i1++) {
                System.out.println(i1 + ":姓名" + info.get(i1).getName());
            }
            int old = info.size();
            int ca = s.nextInt();
            for (int i1 = 0; i1 < info.size(); i1++) {
                if (ca == i1) {
                    info.remove(i1);
                }
            }
            if (info.size() == old) System.out.println("输入有误,即将回到主界面");
            else System.out.println("删除成功,即将回到主界面");
            return info;
        }
        return info;
    }

    public static ArrayList<StudentInfo> changeStudent(ArrayList<StudentInfo> info, StudentInfo i) {
        Scanner s = new Scanner(System.in);
        if (info.size() == 0) {
            System.out.println("暂时没有可修改学生,请添加信息.");
        } else {
            System.out.println("选择你要修改的学生:");
            for (int i1 = 0; i1 < info.size(); i1++) {
                System.out.println(i1 + ":姓名" + info.get(i1).getName());
            }
            ArrayList<StudentInfo> old = info;
            int ca = s.nextInt();
            for (int i1 = 0; i1 < info.size(); i1++) {
                if (ca == i1) {
                    System.out.println("请输入要修改的名字");
                    info.get(i1).setName(s.next());
                    System.out.println("请输入要修改的年纪");
                    info.get(i1).setAge(s.next());
                    System.out.println("请输入要修改的学号");
                    info.get(i1).setAge(s.next());
                    System.out.println("请输入要修改的地址");
                    info.get(i1).setAddress(s.next());
                    System.out.println("修改成功!!即将回到主界面");
                }
            }
            if (old.equals(info)) System.out.println("输入有误!!");
            return info;
    }return info;
}}