package cn.I_basic.day05Array;

public class ArrayTest {
    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 4, 5, 7, 8, 9, 6, 5, 4, 3, 2, 3, 2, 1, 23, 3, 4, 2, 1, 0, 9, 7};
        System.out.println(times(arr));
    }

    private static int times(int[] arr) {
        int sum = 0;
        int t = 0;
        for (int j = 0; j < 30; j++) {

            for (int i = 0, times = 0; i < arr.length; i++) {
                if (arr[i] == j) times++;
                sum++;
                t = times;
            }
            if ((t<1)) {continue;

            }
            System.out.println("出现" + j + "的次数为" + t);
        }
        return sum;
    }
}
