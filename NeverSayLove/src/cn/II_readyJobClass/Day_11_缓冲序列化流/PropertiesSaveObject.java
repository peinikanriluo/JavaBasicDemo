package cn.II_readyJobClass.Day_11_缓冲序列化流;


import java.io.*;
import java.util.Properties;

public class PropertiesSaveObject {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put(1,new StudentMes("淘气",18,'男'));
        properties.put(2,new StudentMes("聘亲",16,'女'));
        properties.put(3,new StudentMes("预交",99,'女'));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("properties.txt"));
        oos.writeObject(properties);
        oos.close();
    }

    public static class GetPropertiesStudentMsg {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("properties.txt"));
            Properties properties = (Properties)ois.readObject();
            StudentMes o1 = (StudentMes) properties.get(1);
            StudentMes o2 = (StudentMes) properties.get(2);
            StudentMes o3 = (StudentMes) properties.get(3);
            System.out.println("o1.getName() = " + o1.getName());
            System.out.println("o1.getAge() = " + o1.getAge());
            System.out.println("o1.getSex() = " + o1.getSex());
            System.out.println("o2.getName() = " + o2.getName());
            System.out.println("o3.getName() = " + o3.getName());

            ois.close();
        }
    }

    static class StudentMes implements Serializable{
        private static final long serialVersionUID = -68497910L;
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

        public StudentMes(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public StudentMes() {
        }
    }
}
