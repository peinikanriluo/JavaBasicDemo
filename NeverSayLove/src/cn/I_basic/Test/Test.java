package cn.I_basic.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String [] arr = {"12","345","6789","1","123","4567"};
        ArrayList<String> o = new ArrayList<>();
        ArrayList<String> j = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()%2 == 0) o.add(arr[i]);
            else j.add(arr[i]);
        }
        System.out.println("o = " + o);
        System.out.println("j = " + j);
    }
}
