package cn.I_basic.day9_Extends_Abstract.RedPackage;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User {
    public GroupMember() {
    }

    public GroupMember(String name, double count) {
        super(name, count);
    }

    public void receive(ArrayList<Double> list){
        Random r = new Random();
        int index = r.nextInt(list.size());

       double acount = getCount()+list.get(index);
        setCount(acount);
        System.out.println("您发财啦!抢到红包"+list.get(index)+"元");
        list.remove(index);
    }
}
