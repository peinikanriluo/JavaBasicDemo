package cn.I_basic.day9_Extends_Abstract.Extendsproject;


public class Test1 {
    public static void main(String[] args) {
        Javacoder j = new Javacoder("程序员小奇",007,9999999);
//        j.work();
        Manager m = new Manager("傻吊经理",250,100,1);
        m.work();
        j.setName("帅比");
        j.setNumber(66666);
        j.setSalary(999999999);
        j.work();
    }
}
