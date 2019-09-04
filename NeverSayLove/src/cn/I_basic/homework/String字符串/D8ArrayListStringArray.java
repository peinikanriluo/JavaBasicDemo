package cn.I_basic.homework.String字符串;

import java.util.ArrayList;


/*定义一个无返回值，参数为String[] 数组的方法，实现以下功能：
1)	把数组中的元素存入到一个ArrayList集合中，删除集合中包含0-9数字的字符串
(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)。
2)  遍历该集合打印剩余元素。

在main方法中，定义一个字符串数组String arr[]={“0af3s2sf”,”s6ds1”,”jjww”,”lailai”}，
并将这个字符串数组传入上述方法中，进行测试。
* */
public class D8ArrayListStringArray {
    public static void main(String[] args) {
        String arr[] = {"0af3s2sf", "s6ds1", "jjww", "lailai"};
        arrayA(arr);
    }

    public static void arrayA(String[] a) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.get(i).length(); i1++) {
                if (list.get(i).charAt(i1) <= '9' && list.get(i).charAt(i1) >= '0')
                    list.remove(i);
            }
        }
        System.out.println("list = " + list);
    }
}

