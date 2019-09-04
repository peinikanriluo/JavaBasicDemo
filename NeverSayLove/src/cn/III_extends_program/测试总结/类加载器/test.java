package cn.III_extends_program.测试总结.类加载器;

public class test {
    public static void main(String[] args) {
        ClassLoader classLoader = test.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println("parent = " + parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);
    }
}
