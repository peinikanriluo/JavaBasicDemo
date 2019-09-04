package cn.I_basic.day9_Extends_Abstract.Person_Worker_Strdent;

public class Worker extends Person{
    String unit;
    int workAge;
    public void work(){
        System.out.println("盖房子");
        System.out.println("年龄"+age+"的"+name+"工人性别为"+gender+"他的职务是"+unit+"工作年纪已经"+workAge+"了");
    }
}
