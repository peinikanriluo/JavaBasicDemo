package cn.II_readyJobClass.Day_13_junit_反射_注解.Class对象的构造方法创建对象注意;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

 class PartyDemo {
    public static void main(String[] args)  throws Exception {
        Properties pro = new Properties();
        pro.load(new FileReader("properties.txt"));
        String singer = pro.getProperty("singer");
        Class<?> singer1 = Class.forName(singer);

//single sin = (Single)singer1.newInstance();
//使用类Class对象创建就可以做到直接使用这个对象,但是方法已经过时

        Constructor<?> constructor = singer1.getConstructor();
        Single sin = (Single) constructor.newInstance();

        sin.sing();
    }
}
public class Dengziqi implements Single{
    //    public Dengziqi() {
//    }
    public void sing(){
        System.out.println("邓紫棋上台唱歌");
    }
    public void song(){
        System.out.println("song");
    }
}
