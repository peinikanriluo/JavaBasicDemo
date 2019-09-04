package cn.II_readyJobClass.Day_4_双列集合Map_初识异常;


import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap();
        m.put("niho",323);
        m.put("niao",232);
        m.put("nhao",23);
        m.put("ihao",233);
        System.out.println(m);

        Set<String> key = m.keySet();
        for (String s : key) {
            System.out.println(s);
        }

        Set ent = m.entrySet();
        System.out.println(ent);
        int num = 0;
        for (Object o : ent) {
            num++;
            if(num==2) m.remove(o);
            System.out.println(o);
        }
        System.out.println(m);

    }
}
