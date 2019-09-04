package cn.I_basic.Test.张三老师;

public class Run {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.setName("苍大炮");
        t.setSubject("母猪的产后护理");
        s.setName("大帅比");
        s.setScore(990);
        s.setT(t);//告诉学生他老师是谁,对象作为成员变量
        t.introduce();
        s.introduce();
        s.result();
    }
}
