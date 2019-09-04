package cn.I_basic.day9_Extends_Abstract.RedPackAgeInt;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User {
    public void receivePackage(ArrayList<Integer> list){
        int r = new Random().nextInt(list.size());
        int reward = list.remove(r);
        System.out.println("恭喜拿到红包"+reward+"元");
        setAcountBalance(getAcountBalance() + reward);
    }
    public GroupMember() {

    }

    public GroupMember(String name, int acountBalance) {
        super(name, acountBalance);
    }

}
