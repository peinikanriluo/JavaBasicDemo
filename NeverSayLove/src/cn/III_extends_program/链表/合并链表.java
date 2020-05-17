package cn.III_extends_program.链表;

import org.junit.Test;

/**
 * @Author: taoqi
 * @Date: 2020/1/16 0016 9:12
 * @Description: cn.III_extends_program.链表
 */

//已知两个链表head1 和head2 各自从小到大有序，请把它们归并成一个链表依然从小到大有序

public class 合并链表 {
    @Test
    public void test01() {
        Node node = new Node(3);
        node.next.data = 4;
        Node node1 = new Node(2);
        node.next.data = 5;
        Merge(node, node1);
    }

    //链表的每个节点类
    private class Node {
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的连接

        public Node(Object data) {
            this.data = data;
        }
    }

    Node Merge(Node head1, Node head2) {
//TODO
        Node next1 = head1;
        Node next2 = head2;
        Node next0 = null;

        for (; ; ) {
            if ((int)next1.data < (int)next2.data) {
                next0 = new Node(next1.data);
                next1 = next1.next;
            }else {
                next0 = new Node(next2.data);
                next2 = next2.next;
            }


        }


    }


}
