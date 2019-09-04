package cn.II_readyJobClass.Day_3_List_Set_初识Map及其子类;


import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
            //创建 map对象
            HashMap<String, String>  map = new HashMap<String, String>();

            //添加元素到集合
            map.put("黄晓明", "杨颖");
            map.put("文章", "马伊琍");
            map.put("邓超", "孙俪");
            System.out.println(map);


            //String remove(String key)
            System.out.println(map.remove("邓超"));
            System.out.println(map);

            // 想要查看 黄晓明的媳妇 是谁
            System.out.println(map.get("黄晓明"));
            System.out.println(map.get("邓超"));
        System.out.println(map.get(1));
        }
    }