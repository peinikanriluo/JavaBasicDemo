package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.HomeWork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class SequenceStudents {
    public static void main(String[] args) {
   Student [] arrs= new Student[60];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i]=new Student("狗儿子",i);
        }
        ArrayList li = new ArrayList();
        for (int i = 0; i < arrs.length; i++) {
            li.add(arrs[i]);
        }
        li.add(new Student("陶帅逼",100));
        li.add(new Student("汪狗逼",-10));

        Collections.sort(li,(Student a,Student b)->b.getScore() - a.getScore());
        System.out.println(li);

    }
}
class Student{
    String name;
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(score);
    }
}