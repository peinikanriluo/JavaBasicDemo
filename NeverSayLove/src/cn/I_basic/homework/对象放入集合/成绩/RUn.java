package cn.I_basic.homework.对象放入集合.成绩;

import java.util.ArrayList;

public class RUn {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        a.setSnum(9001);a.setScore(55.0);
        b.setSnum(9002);b.setScore(66.6);
        c.setSnum(9003);c.setScore(77.0);
        ArrayList<Student> s = new ArrayList<>();
        s.add(a);
        s.add(b);
        s.add(c);
        for (int i = s.size()-1; i >= 0; i--) {
            if (s.get(i).getSnum()==9002) {
                s.remove(i);
            }else
                System.out.println(s.get(i).getSnum()+"     "+s.get(i).getScore());

        }

    }
}
