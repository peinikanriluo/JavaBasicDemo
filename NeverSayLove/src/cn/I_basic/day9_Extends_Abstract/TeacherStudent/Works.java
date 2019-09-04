package cn.I_basic.day9_Extends_Abstract.TeacherStudent;

public class Works {
    public static void main(String[] args) {

        Student s = new Student("奇", 18);
        s.study();
        s.eat();
        System.out.println("=============");
        Teacher t = new Teacher("shadiao", 99);
        t.teach();
        t.eat();
    }
}
