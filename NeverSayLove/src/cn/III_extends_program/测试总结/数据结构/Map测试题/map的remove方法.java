package cn.III_extends_program.测试总结.数据结构.Map测试题;

import java.util.HashMap;
import java.util.Map;

public class map的remove方法 {
    public static void main(String[] args) {
        Map<Object, Object> objectObjectMap = new HashMap<>();
        objectObjectMap.put("name","zhangsan");
        objectObjectMap.put("age",11);
        objectObjectMap.remove("name");
        System.out.println("objectObjectMap = " + objectObjectMap);
    }
}
