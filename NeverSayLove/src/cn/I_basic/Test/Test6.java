package cn.I_basic.Test;

import java.util.Arrays;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(arr));
        int a10 = arr[0];
        for (int i = 0; i < 9; i++) {
            arr[i]=arr[i+1];
        }
        arr[9] = a10;
        System.out.println(Arrays.toString(arr));
    }

}
