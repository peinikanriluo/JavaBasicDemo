package cn.II_readyJobClass.Day_3_List_Set_初识Map及其子类.LinkedList及其父类List及其兄弟ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTestDemo {
    public static void main(String[] args) {
        LinkedList<String > li = new LinkedList<>();
        li.addFirst("你好");
        li.add(1,"你大爷");
        li.add("的");
        li.add("丫丫");
        ArrayList<String > arr = new ArrayList<>();
        arr.add("我是集合");
        arr.add("我是ArrayList");
        System.out.println(li.addAll(arr));//LinkedList中添加ArrayList
        System.out.println(li.size());
    }
}
