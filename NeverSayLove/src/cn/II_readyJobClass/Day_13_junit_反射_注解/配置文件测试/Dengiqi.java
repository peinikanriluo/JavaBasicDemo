package cn.II_readyJobClass.Day_13_junit_反射_注解.配置文件测试;

import java.io.FileReader;
import java.util.Properties;

public class Dengiqi{
    public static void main(String[] args) throws Exception {
        Singer singer = PartyFactory.getSinger();
        singer.sing();
        xuanya dancer = (xuanya)PartyFactory.getDancer();
        dancer.dance();
    }
}
interface Singer{
     void sing();
}
class Deng implements Singer{
    public Deng() {
    }
    @Override
    public void sing() {
        System.out.println("我邓会发光!");
    }
}
class PartyFactory {

    public static Singer getSinger() throws Exception {
//        Singer singer = new WuYiFan();
        Properties p = new Properties();
        p.load(new FileReader("a.txt"));
        String className = p.getProperty("singer");
        Class<?> clazz = Class.forName(className);
        Singer sin = (Singer)clazz.newInstance();
        //过时方法.可以选择使用Class对象的构造器,但是要手写构造函数哦
        return sin;
    }

    public static Singer getDancer(){
        Singer singer = new xuanya();
        return singer;
    }
}

class xuanya implements Singer{
    public xuanya() {
    }

    @Override
    public void sing() {
        System.out.println("不会唱歌");
    }
    public  void dance(){
        System.out.println("脱缰野马知道什么意思么!");
    }
}