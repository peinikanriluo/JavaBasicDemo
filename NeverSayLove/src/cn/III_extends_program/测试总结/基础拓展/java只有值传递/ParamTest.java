package cn.III_extends_program.测试总结.基础拓展.java只有值传递;

/**
 * @author taoqi
 * @date 2019/8/4
 */
public class ParamTest {
    public static void main(String[] args) {
        Student a = new Student(0);
        Student b = new Student(100);

        System.out.println("交换前 : ");
        System.out.println("a的分数 : " + a.getScore() + "  ---  b的分数 : " + b.getScore());

        swap(a, b);

        System.out.println("交换后 : ");
        System.out.println("a的分数 : " + a.getScore() + "  ---  b的分数 : " + b.getScore());
    }
    /*  不变 , 接收的只是形式参数 , 说到底就是拷贝了一份栈中地址 ,并且没有给原来的变量进行赋值操作*/
//       public static void swap(Student x,Student y){
//        Student temp = x;
//        x = y;
//        y = temp;
//    }
    /*改变 , 堆中信息改变 , 原变量之后 根据地址找到堆信息 , 信息以改变*/
    public static void swap(Student x, Student y) {
        x.setScore(100);
        y.setScore(0);
    }
}
