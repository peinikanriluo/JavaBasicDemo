package cn.III_extends_program.测试总结.数据结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列模拟一个堆栈，队列是先进先出，而堆栈是先进后出。模拟如下
 * 队列a和b
 * （1）入栈：a队列为空，b为空。例：则将”a,b,c,d,e”需要入栈的元素先放a中，a进栈为”a,b,c,d,e”
 * （2）出栈：a队列目前的元素为”a,b,c,,d,e”。将a队列依次加入Arraylist集合a中。以倒序的方法，将a中的集
 * 合取出，放入b队列中，再将b队列出列。代码如下：
 */
public class 使用队列模拟堆栈 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();  //a 队列
        Queue<String> queue2 = new LinkedList<String>();   //b 队列
        ArrayList<String> a = new ArrayList<String>();     //arrylist 集合是中间参数
        //往 a 队列添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.print("进栈：");
        //a 队列依次加入 list 集合之中
        for (String q : queue) {
            a.add(q);
            System.out.print(q);
        }
        //以倒序的方法取出（a 队列依次加入 list 集合）之中的值，加入 b 队列
        for (int i = a.size() - 1; i >= 0; i--) {
            queue2.offer(a.get(i));
        }
        //打印出栈队列
        System.out.println("");
        System.out.print("出栈：");
        for (String q : queue2) {
            System.out.print(q);
        }
    }
}