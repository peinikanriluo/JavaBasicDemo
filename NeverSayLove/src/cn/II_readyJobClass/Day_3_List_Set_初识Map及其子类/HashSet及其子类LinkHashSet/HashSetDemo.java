package cn.II_readyJobClass.Day_3_List_Set_初识Map及其子类.HashSet及其子类LinkHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        System.out.println("请输入(不要输入-1哦)");
        HashSet<Integer> h = new HashSet<>();
        Scanner s =new Scanner(System.in);
        while (true){
            int a = s.nextInt();
            if(a == -1) break;
            else h.add(a);
        }
        int sum = 0;
        for (Integer integer : h) {
            sum +=integer;
        }
        System.out.println("您所输入不重复数字总和为"+sum);


    }

}
