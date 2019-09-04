package cn.I_basic.day9_Extends_Abstract.TeacherStudent;

public class School {
    private String name;
    private int age;
    public  void eat(){
        System.out.println();
        System.out.print(name+"开始吃饭并且");
    }

    public School() {
    }

    public School(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
