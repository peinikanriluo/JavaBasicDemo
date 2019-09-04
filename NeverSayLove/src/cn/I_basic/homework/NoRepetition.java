package cn.I_basic.homework;

import java.util.Arrays;
import java.util.Random;

public class NoRepetition {
    public static void main(String[] args) {
        int a[] = new int [10];
        int num = 0;
        Random ra = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=ra.nextInt(12)+1;
            for (int i1 = 0; i1 < a.length; i1++) {
                if(a[i]==a[i1]) num++;
            }
            if(num>1) i--;
            num = 0;

        }
        System.out.print(Arrays.toString(a));
        AnotherWay();
    }
    public static void AnotherWay() {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = r.nextInt(12) + 1;
            int count = 0;
            for (int k = 0; k < arr.length; k++) {
                int m = arr[k];
                if (n == m) {
                    count++;
                }
            }
            if (count > 0) {
                i--;
            } else {
                arr[i] = n;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}
