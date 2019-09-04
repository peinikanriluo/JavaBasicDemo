package cn.I_basic.day9_Extends_Abstract.RedPackage;

import java.util.ArrayList;

public class GroupOwner extends User {
    public GroupOwner() {
    }

    public GroupOwner(String name, double count) {
        super(name, count);
    }

    public ArrayList<Double> sendPackage(double money, int number){
        ArrayList<Double> red = new ArrayList<>();
        if (money>=getCount()) {
            System.out.println("金额不足,穷逼发啥红包");
            return red;
        }
        double a = money/number;
        for (int i = 0; i < number; i++) {
            red.add(a);
        }
        setCount(getCount() - money);
        System.out.println("您已经成功发送红包"+money+"元");
        return red;

    }
}




