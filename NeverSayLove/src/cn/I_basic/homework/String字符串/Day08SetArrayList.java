package cn.I_basic.homework.String字符串;

import java.util.ArrayList;

public class Day08SetArrayList {
    public static void main(String[] args) {
        ArrayList<String> xiyou = new ArrayList<>();
        xiyou.add("孙悟空");
        xiyou.add("猪八戒");
        xiyou.add("沙悟净");
        xiyou.add("狐狸酱");
        System.out.println(xiyou.get(3));
        xiyou.remove(3);
        xiyou.remove(2);
        String new1 =xiyou.get(1).replace("八戒", "悟能");
        xiyou.set(1,new1);
        System.out.println("xiyou = " + xiyou);
    }
}
