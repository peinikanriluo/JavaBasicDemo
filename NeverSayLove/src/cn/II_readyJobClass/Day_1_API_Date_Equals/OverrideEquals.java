package cn.II_readyJobClass.Day_1_API_Date_Equals;

import java.util.ArrayList;

class Student {
    private String age;

    @Override
    public boolean equals(Object obj) {
        Student s = null;
        if(obj instanceof Student){
        s = (Student)obj;
        }

        return this.getAge() == s.getAge();

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String age) {
        this.age = age;
    }
}

public class OverrideEquals {
    public static void main(String[] args) {
        Student s = new Student("19");
        Student s1 = new Student("18");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s.equals(s1));
        ArrayList a = new ArrayList();

    }
}
