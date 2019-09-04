package cn.II_readyJobClass.Day_2_扑克牌Poker;


import java.util.*;

public class MapPokeDemo {
    public static void main(String[] args) {
     Map map = new HashMap<>();
        List<String> l = new ArrayList<>();
        Collections.addAll(l,"♥","♣","♠","♦");
        List<String> l1 = new ArrayList<>();
        Collections.addAll(l1,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        int i = 0;
        for (String s1 : l1) {
            for (String s : l) {
                map.put(i,s+s1);
                i++;
            }
        }
            map.put(52,"小"+"王");
            map.put(53,"大"+"王");
        Set set = map.keySet();
        List shuf = new ArrayList();
        shuf.addAll(set);
        Collections.shuffle(shuf);
        List player1 = new ArrayList();
        List player2 = new ArrayList();
        List player3 = new ArrayList();
        List lowPoke = new ArrayList();
        for (int i1 = 0; i1 < shuf.size(); i1++) {
            if(i1<3) lowPoke.add(map.get(shuf.get(i1)));
            else if (i1%3 == 0) player1.add(shuf.get(i1));
            else if (i1%3 == 1) player2.add(shuf.get(i1));
            else if (i1%3 == 2) player3.add(shuf.get(i1));
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        LookPoker(map,player1,"玩家1");
        LookPoker(map,player2,"玩家2");
        LookPoker(map,player3,"玩家3");

        System.out.println();
        System.out.println("lowPoke =   " + lowPoke);

    }

    private static void LookPoker(Map map,List player,String name) {
        System.out.print("\r\n"+name+":");
        for (Object o : player) {
            System.out.print("  "+map.get(o));
        }
    }
}
