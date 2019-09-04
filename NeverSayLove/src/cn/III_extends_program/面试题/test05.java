package cn.III_extends_program.面试题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author taoqi
 * @date 2019/8/13
 */
public class test05 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(1,"3");
        List list2 = new LinkedList(list);
        list.addAll(list2);
        list2 = list.subList(2,5);
//        list2.clear(); //list的clear()方法会把sublist截取的集合部分从list1中移除掉。
        System.out.println(list);
    }
}
