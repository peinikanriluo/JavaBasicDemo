package cn.II_readyJobClass.Day_3_List_Set_初识Map及其子类.HashSet及其子类LinkHashSet;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Method2HashSet {

    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "2347809933", "98765432102", "67891", "12347809933"};
        LinkedList l = new LinkedList();
        for (int i = 0; i < strs.length; i++) {
            l.add(strs[i]);
        }
        HashSet h = new HashSet();
        h.addAll(l);
        System.out.println(h);
        LinkedList l2 = method2(strs);
        System.out.println(l2);
        Iterator it = h.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static LinkedList method2(String[] strs) {
        LinkedList l = new LinkedList();
        for (int i = 0; i < strs.length; i++) {
            l.add(strs[i]);
            int num = 0;
            for (Object o : l) {
                if (o == strs[i]) {
                    num++;
                }
                if (num == 2)
                    l.remove(strs[i]);
            }
        }
        return l;
    }
}

