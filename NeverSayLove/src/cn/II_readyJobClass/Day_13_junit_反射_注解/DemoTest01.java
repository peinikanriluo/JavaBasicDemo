package cn.II_readyJobClass.Day_13_junit_反射_注解;

import java.lang.reflect.Constructor;

public class DemoTest01 {
    public static void main(String[] args) throws Exception {
        test01();
        test02();
        test03();
        test04();
    }

    /**
     * 4. Constructor[] getDeclaredConstructors()
     * 获取所有构造方法，包括privat修饰的
     */
    public static void test04() throws Exception {
        System.out.println("----------- test04() -----------");
// 获取Student类的Class对象
        Class c = Student.class;
// 获取所有的public和private修饰的构造方法
        Constructor[] cons = c.getDeclaredConstructors();
// 遍历构造方法数组
        for (Constructor con : cons) {
// 输出con
            System.out.println(con);
        }
    }

    /**
     * 3. Constructor[] getConstructors()
     * 获取所有的public修饰的构造方法
     */
    public static void test03() throws Exception {
        System.out.println("----------- test03() -----------");
// 获取Student类的Class对象
        Class c = Student.class;
// 获取所有的public修饰的构造方法
        Constructor[] cons = c.getConstructors();
// 遍历构造方法数组
        for (Constructor con : cons) {
// 输出con
            System.out.println(con);
        }
    }

    /**
     * 2. Constructor getDeclaredConstructor(Class... parameterTypes)
     * 根据参数类型获取构造方法对象，包括private修饰的构造方法。
     * 如果不存在对应的构造方法，则会抛出 java.lang.NoSuchMethodException 异常。
     */
    public static void test02() throws Exception {
        System.out.println("----------- test02() -----------");
// 获取Student类的Class对象
        Class c = Student.class;
        Constructor cons = c.getDeclaredConstructor(String.class,String.class);
// 注意：private的构造方法不能直接调用newInstance创建对象，需要暴力反射才可以
// 设置取消权限检查（暴力反射）//这个只是构造方法不同的原因
        cons.setAccessible(true);
// 调用Constructor方法创建学生对象
        Student stu = (Student) cons.newInstance("林青霞","女");
// 输出stu
        System.out.println(stu);
    }
    /**
     1. Constructor getConstructor(Class... parameterTypes)
     根据参数类型获取构造方法对象，只能获得public修饰的构造方法。
     如果不存在对应的构造方法，则会抛出 java.lang.NoSuchMethodException 异常。
     */
    public static void test01() throws Exception{
        System.out.println("----------- test01() -----------");
// 获取Student类的Class对象
        Class c = Student.class;
// 根据参数获取对应的构造方法对象
        Constructor cons = c.getConstructor(String.class,String.class,int.class);
// 调用Constructor方法创建学生对象
        Student stu = (Student) cons.newInstance("张曼玉","女",28);
// 输出stu
        System.out.println(stu);
    }

}
class Student{
    // 姓名
    private String name;
    // 性别
    public String gender;
    // 年龄
    private int age;
    // public 有参构造方法
    public Student(String name, String gender, int age) {
        System.out.println("public 修饰有参数构造方法");
        this.name = name;
        this.gender = gender;
        this.age = age;
    }// public 无参构造方法
    public Student() {
        System.out.println("public 修饰无参数构造方法");
    }
    // private 有参构造方法
    private Student(String name,String gender){
        System.out.println("private 修饰构造方法");
        this.name = name;
        this.gender = gender;
    }
    // getter & setter 方法
    /*
     * 此处为 getter & setter方法 省略...
     */
// 普通方法
    public void sleep(){
        System.out.println("睡觉");
    }
    public void sleep(int hour){
        System.out.println("public修饰---sleep---睡" + hour + "小时");
    }
    private void eat(){
        System.out.println("private修饰---eat方法---吃饭");
    }
    // 静态方法
    public static void study(){
        System.out.println("静态方法---study方法---好好学习Java");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

