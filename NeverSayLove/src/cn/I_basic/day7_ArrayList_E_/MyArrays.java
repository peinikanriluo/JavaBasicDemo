package cn.I_basic.day7_ArrayList_E_;


import java.util.ArrayList;

public class MyArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(2341);
        list.add(235);
        list.add(432);
        list.add(843598324);
        list.add(436436);
        reverse(list);
        System.out.println("list最大值 = " + max(list));
        System.out.println("min(list) = " + min(list));
        System.out.println("元素第一次出现位置是：" + indexOf(list, 235));
        replaceAll(list, 23, 00000);
    }

    public static void reverse(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(i, list.get(list.size() - 1 - i));
        }
        System.out.println("list = " + newList);
    }

    public static Integer max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static Integer min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int indexOf(ArrayList<Integer> list, Integer i) {
        return list.indexOf(i);
    }

    public static void replaceAll(ArrayList<Integer> list, Integer oldValue, Integer newValue) {
        int a = oldValue, b = newValue;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == a) {
                list.set(i, b);
            }
        }
        System.out.println("list = " + list);
    }


}
