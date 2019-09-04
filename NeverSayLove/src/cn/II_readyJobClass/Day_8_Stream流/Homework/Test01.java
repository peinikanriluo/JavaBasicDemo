package cn.II_readyJobClass.Day_8_Stream流.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList();
        List<Integer> li2 = new ArrayList();
        Collections.addAll(li,1,-2,-3,4,-5);
        List<Integer> collect = li.stream().map(ma -> Math.abs(ma)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
