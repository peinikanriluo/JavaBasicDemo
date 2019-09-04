package cn.III_extends_program.面试题;


/**
 * @author taoqi
 * @date 2019/8/13
 */
class MyTest extends  test04{
    public MyTest(){
        System.out.println("S2");
    }
}
public class test04 {
    public static void main(String[] args) {
        new MyTest();
    }
    public test04(){
        System.out.println("S1");
    }
}
