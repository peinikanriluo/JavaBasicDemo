package cn.III_extends_program.面试题.测试;

/**
 * @Author: sunset
 * @Date: 2019/9/4 10:54
 * @Description: cn.III_extends_program.面试题.测试
 */
public class Exam {

    public static void main(String[] args) {
//        People people = new People();
//        System.out.println("people.name = " + people.name);
//        System.out.println("people.num = " + people.num);
//        int age = people.num;

        Integer a = new Integer(1);
        boolean boo = a == 0.5*2;
        System.out.println("boo = " + boo);
        System.out.println(new Integer(1) == new Integer(1));

    }
}
