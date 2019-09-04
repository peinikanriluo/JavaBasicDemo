package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        Students [] arrs= new Students[60];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i]=new Students("a儿子",i);
        }
        ArrayList li = new ArrayList();
        for (int i = 0; i < arrs.length; i++) {
            li.add(arrs[i]);
        }
        li.add(new Students("c帅逼",100));
        li.add(new Students("d狗逼",-10));

        Collections.sort(li,((Students a,Students b)->a.getName().charAt(0)-b.getName().charAt(0)));
        System.out.println(li);

    }
}
class Students {
    String name;
    int score;
    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}'+"\r\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}