package cn.III_extends_program.测试总结.数据结构.Map测试题;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_table键值能否为null {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();//HashMap 对象
       Map<String, String> tableMap = new Hashtable<String, String>();//HashTable 对象
        map.put(null,"234");
         map.put(null, null);
         System.out.println("hashMap 的[key]和[value]均可以为 null:" + map.get(null));
         try {
             tableMap.put(null, "3");
             System.out.println(tableMap.get(null));
         } catch (Exception e) {
             System.out.println("【ERROR】：hashTable 的[key]不能为 null");
         }
         try {
             tableMap.put("3", null);
             System.out.println(tableMap.get("3"));
         } catch (Exception e) {
             System.out.println("【ERROR】：hashTable 的[value]不能为 null");
         }
    }
}
