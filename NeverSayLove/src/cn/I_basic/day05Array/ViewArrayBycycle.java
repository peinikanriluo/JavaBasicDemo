package cn.I_basic.day05Array;

public class ViewArrayBycycle {
    public static void main(String[] args) {
        int[] arrayA = {12, 34, 54, 342, 643, 24, 12, 43, 53, 45};
        System.out.println("数组长度为："+arrayA.length);
//  可通过计算机输出得知数组长度为10
        for (int i = 0; i < 10; i++)
//  可输入快捷方式10.fori 使用循环方式可快速查看数组内容
            System.out.println(arrayA[i]);
        System.out.println("==================");
//  方法不便于修改并且麻烦 可以直接采用arrayA.fori
        for (int i1 = 0; i1 < arrayA.length; i1++) {
            System.out.println(arrayA[i1]);
        }
    }
}
