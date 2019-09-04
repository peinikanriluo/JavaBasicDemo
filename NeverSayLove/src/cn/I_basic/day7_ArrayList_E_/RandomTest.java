package cn.I_basic.day7_ArrayList_E_;


import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        System.out.println("没换零Arrays.toString(arr) = " + Arrays.toString(arr));
        int times = Remove0(arr);
        System.out.println("换零Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("times = " + times);
        //为嘛两个随机数输出结果一样？？？
    }

    private static int Remove0(int []arr) {
        Random R=new Random();
        int times=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                arr[i]=R.nextInt(10) +1;
                times++;
            }
        }
        return times;
//        System.out.println(Arrays.toString(arr));
    }
}