package cn.II_readyJobClass.Day_11_缓冲序列化流.序列化流保存对象_Serializable;


import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Student s1 = new Student("套大气",18,"男");
        Student s2 = new Student("物品亲",17,"女");
        Student s3 = new Student("徐预交",99,"女");
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        Student s4 = (Student) ois.readObject();
        Student s5 = (Student) ois.readObject();
        Student s6 = (Student) ois.readObject();
        System.out.println("s4.getName() = " + s4.getName());
        System.out.println("s4.getAge() = " + s4.getAge());
        System.out.println("s5.getAge() = " + s5.getAge());
        System.out.println("s6.getAge() = " + s6.getAge());
        ois.close();
        oos.close();
    }
}
