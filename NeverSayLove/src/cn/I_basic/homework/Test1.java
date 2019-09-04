package cn.I_basic.homework;

public class Test1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("奇数和："+oddNumber(arr));
        System.out.println("偶数和："+evenNumber(arr));
        System.out.println("总和："+ sum(arr));
    }

    private static int sum(int[] arr) {
            int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

    private static int evenNumber(int[] arr) {
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) sum+=arr[i];
        }
        return sum;
    }

    private static int oddNumber(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) sum+=arr[i];

        }
        return sum;
    }


}