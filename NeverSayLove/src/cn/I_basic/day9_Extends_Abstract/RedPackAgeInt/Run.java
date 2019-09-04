package cn.I_basic.day9_Extends_Abstract.RedPackAgeInt;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        GroupMember g = new GroupMember("大炮",101);
        GroupOwner o = new GroupOwner("小炮",4);
        ArrayList<Integer> pack=o.sendPackage(3,2);
        g.receivePackage(pack);
    }
}
