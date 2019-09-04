package cn.I_basic.day9_Extends_Abstract.RedPackAgeInt;

import java.util.ArrayList;

public class GroupOwner extends User {
    public ArrayList<Integer> sendPackage(int money,int amount){
        ArrayList<Integer> list = new ArrayList<>();
        if(getAcountBalance()<money) {System.out.println("金额不足");
        return list;}
        else System.out.println("您已成功发送红包"+money+"元");
        setAcountBalance(getAcountBalance()-money);
        for (int i = 0; i < amount-1; i++) {
            list.add(money/amount);
        }
        list.add(money/amount+money%amount);
        return list;

    }
    public GroupOwner() {

    }

    public GroupOwner(String name, int acountBalance) {
        super(name, acountBalance);
    }
}
