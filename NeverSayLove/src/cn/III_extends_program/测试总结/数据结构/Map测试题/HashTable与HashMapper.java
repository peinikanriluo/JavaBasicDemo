package cn.III_extends_program.测试总结.数据结构.Map测试题;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author taoqi
 * @date 2019/8/5
 */
public class HashTable与HashMapper {
    public static void main(String[] args) {
        Hashtable<Object, Object> table = new Hashtable<>();
        table.put("1","haha");
        //那不存在的数都不会报错 的 , HashTale 增加了线程安全 , 并且其键值都不能为null
        System.out.println("table.get(\"2\") = " + table.get("2"));
        //而hashMap 的键值都可以为null
        System.out.println("new HashMap().get(null) = " + new HashMap().get(null));


    }
}
