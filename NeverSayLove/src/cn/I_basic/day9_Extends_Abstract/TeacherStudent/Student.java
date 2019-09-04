package cn.I_basic.day9_Extends_Abstract.TeacherStudent;

public class Student extends School{
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public void  study(){
        System.out.println(getName()+"正在学习");
    }
    public void eat(){
        super.eat();
        System.out.println("开着飞机");
    }

}
