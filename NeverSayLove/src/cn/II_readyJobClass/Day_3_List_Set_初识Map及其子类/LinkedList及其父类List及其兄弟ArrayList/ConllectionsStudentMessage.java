package cn.II_readyJobClass.Day_3_List_Set_初识Map及其子类.LinkedList及其父类List及其兄弟ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ConllectionsStudentMessage {
    public static void main(String[] args) {
        // 创建四个学生对象 存储到集合中
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("rose",18));
        list.add(new Student("jack",16));
        list.add(new Student("abc",16));
        list.add(new Student("ace",17));
        list.add(new Student("mark",16));


        /*
          让学生 按照年龄排序 升序
         */
        Collections.sort(list);//要求 该list中元素类型  必须实现比较器Comparable接口
        //需要学生类实现Student implements Comparable<Student>

        for (Student student : list) {
            System.out.println(student);
        }


    }

    public static class Student implements Comparable<Student> {
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
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

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return age   - o.age;
        }
    }
}
