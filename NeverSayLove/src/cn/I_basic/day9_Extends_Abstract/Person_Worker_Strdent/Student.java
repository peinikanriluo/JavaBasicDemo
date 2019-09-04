package cn.I_basic.day9_Extends_Abstract.Person_Worker_Strdent;

public class Student extends Person {
    String school;
    int stuNumber;

    public Student(String school, int stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public void work(){
        System.out.println("学习");
        System.out.println("年龄"+age+"的"+name+"学生性别为"+gender+"学号是"+stuNumber+"打飞机了");
    }

    public Student() {
    }
}
