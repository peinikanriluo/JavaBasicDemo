package cn.I_basic.day7_ArrayList_E_;

public class Student {
    private String name;
    private int age;
    public String getName(){
        this.name = name;
        return name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        this.age = age;
        return age;

    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
