package cn.II_readyJobClass.Day_1_API_Date_Equals.test.Person;

import java.util.ArrayList;

public class Run {
    static ArrayList<String> p = new ArrayList<>();
    public static void main(String[] args) {
        String [] s = new String[]{"a","b", "c", "c", "a", "b", "b", "v", "a"};
        for (int i = 0; i < s.length; i++) {
            p.add(s[i]);
        }
        frequency(p,"a");



    }
    public static void frequency(ArrayList<String> arr,String key){
        int i = 0,j=0;
        for (String s : arr) {
           if( arr.get(j).equals(key)) i++;
           j++;
        }
        System.out.println(i);
    }
}
