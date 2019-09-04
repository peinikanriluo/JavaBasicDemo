package cn.II_readyJobClass.Day_8_Stream流.Homework;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"};
        Object[] 郭s = Stream.of(arr).filter(a1 -> a1.startsWith("郭")).toArray();
        for (Object 郭 : 郭s) {
            System.out.print(郭 + "    ");
        }
        System.out.println();
        Object[] objects = Stream.of(arr).limit(2).toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        Object[] objects1 = Stream.of(arr).skip(6).toArray();
        for (Object o : objects1) {
            System.out.println(o);
        }

    }
}
