package cn.III_extends_program.测试总结.数据结构;

import java.util.HashMap;
import java.util.Map;

/**
 * 用面向对象的方法求出数组中重复 value 的个数，按如下个数输出：
 1 出现：1 次
 3 出现：2 次
 8 出现：3 次
 2 出现：4 次
 int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
 */

public class 数组重复value个数 {
    public static void main(String[] args) {
        int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
        long l = System.currentTimeMillis();
        Map map = findSameTimes(arr);
        for (Object o : map.keySet()) {
            System.out.println(o+" 出现次数 : "+map.get(o));
        }
        long l1 = System.currentTimeMillis();
        System.out.println("用时:"+(l1-l)+"毫秒");
    }

    private static Map findSameTimes(int[] arr) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            if (null!=hashMap.get(i1)){
                continue;
            }
            int times = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i1==arr[j]){
                    hashMap.put(i1,++times);
                }
            }
        }
        return hashMap;
    }
}
