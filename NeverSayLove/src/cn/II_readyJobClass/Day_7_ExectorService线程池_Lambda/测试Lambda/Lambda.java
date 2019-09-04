package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.测试Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Lambda {

    public static void main(String[] args) {

        new Thread( () -> {
            System.out.println("哈哈");
        }).start();

        new Thread( () -> System.out.println("xixi") ).start();

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,3,4,1,2,6,8,5,9,88,55,3,33,221,11,44,56,77);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        Collections.sort(list,(Integer o1,Integer o2)->{return(o2-o1);});
        System.out.println(list);
        Collections.sort(list,(o1,o2) -> o1-o2);
        System.out.println(list);
    }
}
