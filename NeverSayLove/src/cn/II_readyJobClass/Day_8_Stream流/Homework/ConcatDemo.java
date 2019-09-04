package cn.II_readyJobClass.Day_8_Stream流.Homework;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatDemo {
    public static void main(String[] args) {
        String[] arr1 = {"郭靖", "杨康"};
        String[] arr2 = {"黄蓉", "莫念慈"};
        System.out.println(Stream.concat(Stream.of(arr1), Stream.of(arr2)).collect(Collectors.toList()));


//        List<String> collect = Stream.concat(Stream.of(arr1),
//                Stream.of(arr2)).collect(Collectors.toList());
//        System.out.println(collect);
    }
}