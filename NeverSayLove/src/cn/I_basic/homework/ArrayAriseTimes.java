package cn.I_basic.homework;

public class ArrayAriseTimes {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int num = Times(arr);
        System.out.println("数组中只出现一次的元素有" + num + "个");
    }

    private static int Times(int[] arr) {
        int num = 0, cishu = 0, max = arr[0];
        for (int b = 0; b < arr.length; b++) {
            if (max > arr[b]) ;
            else max = arr[b];
        }
        for (int j = 0; j < max; j++) {
            for (int i = 0, times = 0; i < arr.length; i++) {
                if (arr[i] == j) times++;
                cishu = times;
            }
            if (cishu == 1) num++;
        }
        return num;
    }
}
