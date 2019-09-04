package cn.II_readyJobClass.Day_3_List_Set_初识Map及其子类.HashSet及其子类LinkHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new /*Linked*/HashSet<>();//有序的
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
