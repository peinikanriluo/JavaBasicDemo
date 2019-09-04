package cn.III_extends_program.测试总结.基础拓展.递归;

import java.util.Scanner;

/**
 * @author taoqi
 * @date 2019/8/9
 */
public class TestRecursion {
    /*一个整数，大于0，不用循环和本地变量，
    按照 n，2n，4n，8n 的顺序递增，当值大于5000 时，把值按照指定顺序输出来。 */
    public static void main(String[] args) {
        System.out.println("输入:");
        recursion(new Scanner(System.in).nextInt());
    }

    private static void recursion(int nextInt) {
        if (nextInt<=5000){
            System.out.println(nextInt+",");
            recursion(2*nextInt);
            System.out.println(nextInt+",");
        }else {
            System.out.println(nextInt+",");
            System.out.println(nextInt+",");
        }
    }
}
