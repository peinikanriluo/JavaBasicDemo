package cn.I_basic.day6_Object.StandardClass;

/*
标准的类需要有以下四个部分
每个成员变量都要使用private关键词修饰
为每个成员变量编写一堆Getter/Setter方法
编写一个无参数构造方法
编写一个全参数构造方法
*/

public class Student {
    public static String name;//加上public不同包可使用，加上static可以直接使用变量。
    //用了private关键词的成员变量 对象 就不能自己在调用时随便修改了，需要调用构造方法。
    private static int age;

    public static int getAge() {
        return age;
    }

    public static void setAge(int a) {
        age = a;
    }

    public static String getName() {

        return name;
    }

    public static void setName(String n) {
        name = n;

    }
}




