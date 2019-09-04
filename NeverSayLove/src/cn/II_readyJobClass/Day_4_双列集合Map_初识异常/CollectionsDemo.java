package cn.II_readyJobClass.Day_4_双列集合Map_初识异常;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*addAll
        * shuffle
        * sort
        * */
        ArrayList arr = new ArrayList();
        Collections.addAll(arr,3,34,43,34,43,2,23,2,4);
          Collections.sort(arr);



        Comparable a = "3kjjjiioui";
        System.out.println(a);




        System.out.println(arr);
        Collections.addAll(arr,"dijfia","eijwiw","efijwji","rqwr");
//        Collections.sort(arr);
        System.out.println(arr);

        Set s = new HashSet();
        Collections.addAll(s,2,3,32,23,3,2,23,23,23);
        System.out.println(s);



    }
}
