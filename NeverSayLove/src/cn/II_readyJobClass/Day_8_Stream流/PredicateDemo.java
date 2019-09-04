package cn.II_readyJobClass.Day_8_Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] array = {"d迪丽热巴,女", "c古力娜扎,女", "a马尔扎哈,男", "b赵丽颖,女"};
        methodSplit(array);
        methodMeinv(array);
        ArrayList list = new ArrayList();
        for (String s : array) {
            list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        System.out.println("匿名内部类Comparator接口排序得"+list);
    }
        private static void methodMeinv (String[]array){
            ArrayList<String> arr = new ArrayList<>();
            Predicate<String> p1 = pp -> pp.split(",")[0].contains("扎");
            Predicate<String> p2 = pp -> pp.split(",")[1].equals("女");
            for (String s : array) {
                if (p2.and(p1.negate()).test(s)) {
                    arr.add(s);
                }

            }
            System.out.println("美女在这呢!" + arr);

        }

        private static void methodSplit (String[]s){
            ArrayList a = new ArrayList();
            Predicate<String> b1 = (bb) -> bb.split(",")[1].equals("女");
            Predicate<String> b2 = (bb) -> bb.split(",")[0].length() == 3;

            for (String s1 : s) {
                if (b1.and(b2).test(s1)) {
                    a.add(s1);
                }
            }
            System.out.println(a);

        }

    }
