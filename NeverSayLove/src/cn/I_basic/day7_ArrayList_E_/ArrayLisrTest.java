package cn.I_basic.day7_ArrayList_E_;

import java.util.ArrayList;

public class ArrayLisrTest {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("爱要转几个弯才来");
        strList.add("向左向右向前看");
        System.out.print(strList.add("阴天傍晚车窗外"));
        strList.add("我在某年某月醒过来");
        strList.add("我遇见谁会有这样的对白");
        strList.add("我等的人 她在多远的未来。");//运用方法排序
        System.out.println(new ArrayList<String>(5));
        //无论写几号元素都不会报错，只会打印一个“【】”
//        System.out.println("srtList = " + strList);//报错 初步判断类型不符
//        System.out.println(jihe(strList));
        strList= jihe(strList);
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

    }

    public static ArrayList<String> jihe(ArrayList<String> zaijian) {
        ArrayList<String> gether = new ArrayList<>();
        gether.add(zaijian.get(2));
        gether.add(zaijian.get(3));
        gether.add(zaijian.get(1));
        gether.add(zaijian.get(0));
        gether.add(zaijian.get(4));
        gether.add(zaijian.get(5));
//       System.out.println(gether);
        return gether;
    }
}