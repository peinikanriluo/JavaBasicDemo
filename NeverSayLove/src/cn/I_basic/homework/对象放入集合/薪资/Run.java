package cn.I_basic.homework.对象放入集合.薪资;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Student a = new Student("张三",151345132);
        Student b = new Student("李四",22);
        Student c = new Student("王五",15000);
        Student d = new Student("王二麻子",8330);
        ArrayList<Student> s = new ArrayList<>();
        a.boo();
        b.boo();
        c.boo();
        d.boo();
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);
        for (int i = 0; i < s.size(); i++) {
            System.out.print("姓名:"+s.get(i).getName()+" 薪水");
        System.out.println(s.get(i).getSal());
        }



    }
}
