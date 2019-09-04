package cn.II_readyJobClass.Day_13_junit_反射_注解.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class TestClass {
    public static void main(String[] args) throws Exception {
        Class<Person> p = Person.class;
        Constructor<Person> constructor = p.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Person ininin = constructor.newInstance( "taiqi",18);
        System.out.println(ininin);

        Method huigi = p.getDeclaredMethod("beatPlane");
        huigi.setAccessible(true);
        huigi.invoke(p);

        Field dada = p.getDeclaredField("name");
        dada.setAccessible(true);
//        Person person = p.newInstance(); //过时方法
        dada.set(ininin,"taoqi");
        System.out.println(dada.get(ininin));
    }
}
class Person{
   private String name;

    private Person(String name) {
        this.name = name;
    }
    private  void beatPlane(){
        System.out.println("开始打灰给");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int age;

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}