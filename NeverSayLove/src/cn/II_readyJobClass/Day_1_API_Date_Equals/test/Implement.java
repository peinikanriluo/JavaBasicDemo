package cn.II_readyJobClass.Day_1_API_Date_Equals.test;

public class Implement implements InterfaceDemo{

    @Override
    public <String> void show(String e) {
        System.out.println("实现类对象已运行");
    }

    public static void main(String[] args) {
        Implement i = new Implement();
        i.show("nihao");
    }
}
