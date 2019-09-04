package cn.II_readyJobClass.Day_13_junit_反射_注解;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test拖拖拖拖11 {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<stu1> stu1Class = stu1.class;
        Method method1 = stu1Class.getDeclaredMethod("method1");
        method1.setAccessible(true);
        stu1 str =new stu1("dengziqi",18);
        method1.invoke(str);

    }
}
class stu1 {
    String name;
    int age;

    public stu1(String name, int age, char gendar) {
        this.name = name;
        this.age = age;
        this.gendar = gendar;
    }

    public stu1(String dengziqi, int i) {
        this.name = dengziqi;
        this.age = i;
    }

    public void method1(){
        System.out.println("方法执行!!!");
    }


    char gendar;

}
