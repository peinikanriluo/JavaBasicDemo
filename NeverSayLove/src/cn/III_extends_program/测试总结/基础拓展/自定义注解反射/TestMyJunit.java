package cn.III_extends_program.测试总结.基础拓展.自定义注解反射;

/**
 * @author taoqi
 * @date 2019/7/28
 */
public class TestMyJunit {
    public void method0(){
        System.out.println("没有junit");
    }
    @MyJunit.MyJunitTest
    public void method1(){
        System.out.println("xixi");
    }
    @MyJunit.MyJunitTest
    public void method2(){
        System.out.println("huhu");
    }

}
