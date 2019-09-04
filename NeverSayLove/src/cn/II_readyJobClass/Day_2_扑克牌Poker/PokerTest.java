package cn.II_readyJobClass.Day_2_扑克牌Poker;

import java.util.*;

public class PokerTest {
    public static void main(String[] args) {
        ArrayList<String> poke = new ArrayList<>();
        String s;
        for (int a = 0; a < 4; a++) {
            if (a == 1) s = "♠";
            else if (a == 2) s = "♣";
            else if (a == 3) s = "♥";
            else s = "♦";
            for (int i = 0; i < 13; i++) {
                if (i == 0) poke.add("K" + s);
                else if (i == 11) poke.add("J" + s);
                else if (i == 12) poke.add("Q" + s);
                else poke.add(i + "" + s);
            }
        }
        poke.add("小王");
        poke.add("大王");
//        Iterator<String> it = poke.iterator();
        Collections.shuffle(poke);
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
        ArrayList<String> a4 = new ArrayList<>();

        for (int i = 0; i < poke.size(); i++) {
            if (i < 3) a4.add(poke.get(i));
            else if (i % 3 == 0) a1.add(poke.get(i));
            else if (i % 3 == 1) a2.add(poke.get(i));
            else if (i % 3 == 2) a3.add(poke.get(i));
        }
        Random ran = new Random();
        Collections.sort(a1);
        Collections.sort(a2);
        Collections.sort(a3);
        Collections.sort(a4);
        System.out.println(ran.nextInt(3) + 8 + "戒家为地主;底牌是:" + a4);
        System.out.println("八戒" + a1);
        System.out.println("九戒" + a2);
        System.out.println("十戒" + a3);


    }

    public static void function(Object t) {
        System.out.println(t);
    }

}

