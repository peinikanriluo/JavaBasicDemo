package cn.II_readyJobClass.Day_13_junit_反射_注解.test;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class MethodReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<Personer> personer = Personer.class;
        Constructor<Personer> constructor = personer.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Personer ececec = constructor.newInstance("yunxingla");
        System.out.println(ececec);

        Method run = personer.getDeclaredMethod("run");
        Personer per = constructor.newInstance("wupinqin");
        run.setAccessible(true);
        run.invoke(per);

    }
}
class Personer {
    String name;

    public Personer() {
    }

    @Override
    public String toString() {
        return "Personer{" +
                "name='" + name + '\'' +
                '}';
    }

    private Personer(String name) {
        this.name = name;
    }

    private void run(){
        System.out.println("run方法运行sdfijjifsdijadfji");
    }
    private void go(){
        System.out.println("跑起来,"+name);
    }
}
