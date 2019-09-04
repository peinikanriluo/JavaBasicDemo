package cn.II_readyJobClass.Day_4_双列集合Map_初识异常.两种方法识别字符串元素;

import java.util.*;


public class getOrDefault {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        System.out.println("输入字符串");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        getOrDefault(m, str);
        System.out.println(m);
        System.out.println("=======================");
        System.out.println("再次输入字符串");
        String ss = s.next();
        Map mm = new HashMap();
        puTongFangfa(mm, ss);
        System.out.println(mm);

    }//注意呀 集合和数组一样，方法会改变集合的值。

    private static void getOrDefault(Map<Character, Integer> m, String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer/*或者用int*/ number = m.getOrDefault(c, 0);
            //点开getOrDefault源码，意思就是当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
            m.put(c, ++number);
        }
    }

    public  static void  puTongFangfa(Map<Character, Integer> m, String str){
            Set<Character> s = m.keySet();
        for (int i = 0; i < str.length(); i++) {
            Integer num = m.get(str.charAt(i));
            if(s.contains(str.charAt(i))){
                m.put(str.charAt(i),++num);
            }else m.put(str.charAt(i),1);
        }


    }
}
