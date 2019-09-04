package cn.I_basic.day05Array;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int[]array={1,32,3,3,5,6,9,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//使用面向对象；找到一个JDk给我们提供好的Arrays类；（偷懒^v^)Array构造空参隐藏了，不可创建无参对象。
//其中有一个toString方法，直接就能把数组变成想要的格式的字符串

    }
}
