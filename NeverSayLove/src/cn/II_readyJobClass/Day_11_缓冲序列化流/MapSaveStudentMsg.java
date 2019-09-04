package cn.II_readyJobClass.Day_11_缓冲序列化流;

import java.io.*;
import java.util.*;

public class MapSaveStudentMsg {
    public static void main(String[] args) throws IOException {
    Map map = new HashMap();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("map.txt"));
    map.put(1,new StudentMsg("大奇",18,'m'));
    map.put(2,new StudentMsg("pinqin",16,'g'));
    map.put(3,new StudentMsg("邓紫棋",20,'g'));
    oos.writeObject(map);
    oos.close();
    }

    static class GetMapStudentMsg{
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("map.txt"));
            Map map = (Map)ois.readObject();
            Collection values = map.values();
            List<StudentMsg> list =new ArrayList();
            list.addAll(values);
            for (StudentMsg studentMsg : list) {
                System.out.println("studentMsg.getName() = " + studentMsg.getName());
            }
            ois.close();


        }
    }

    static class StudentMsg implements Serializable {
        private static final long serialVersionUID = 0754667710L;
        private String name;
        private transient int age;
        private char sex;

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

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public StudentMsg(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public StudentMsg() {
        }
    }
}

