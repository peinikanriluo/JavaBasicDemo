package cn.I_basic.day9_Extends_Abstract.RedPackage;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        GroupOwner o = new GroupOwner("大帅",1000);
//        o.sendPackage(100,10);
        GroupMember m1 = new GroupMember("傻吊",9);
        ArrayList<Double> i = o.sendPackage(100,13);
        m1.receive(i);
        o.show();
        m1.show();
    }
}
