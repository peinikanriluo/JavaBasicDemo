package cn.III_extends_program.测试总结.基础拓展.自定义注解反射;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author taoqi
 * @date 2019/7/28
 */
public class MyJunit {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<TestMyJunit> clazz = TestMyJunit.class;
        Object obj = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            boolean result = method.isAnnotationPresent(MyJunitTest.class);
            if(result){
                method.invoke(obj);
            }
        }
    }
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyJunitTest {

    }
}
