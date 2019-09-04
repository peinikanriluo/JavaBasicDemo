package cn.II_readyJobClass.Day_8_Stream流;


import java.util.*;
/*姓名	成绩
岑小村	59
谷天洛	82
渣渣辉	98
蓝小月	65
皮几万	70*/

public class StreamFilterDemo {
    public static void main(String[] args) {
        Map map =new HashMap<>();
        map.put(59,"岑小村");
        map.put(82,"谷天洛");
        map.put(98,"渣渣辉");
        map.put(65,"蓝小月");
        map.put(70,"皮几万");
        Set<Integer> strings = map.keySet();
        System.out.println(strings);
        ArrayList a = new ArrayList<String>();
        a.addAll(strings);
        System.out.println(a);
        a.stream().map(aa->map.get(aa)).forEach(aaa-> System.out.println(aaa));
    }
}

