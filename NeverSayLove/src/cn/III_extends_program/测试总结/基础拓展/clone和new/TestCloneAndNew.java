package cn.III_extends_program.测试总结.基础拓展.clone和new;

import java.util.Date;

/**
 * @author taoqi
 * @date 2019/8/2
 */
public class TestCloneAndNew {
    public static void main(String[] args) {
        // Person类需要实现 Cloneable 接口
        // Person类需要重写 Object类的 Clone方法
        // 对于属性为 引用类型 的拷贝 请参考 浅拷贝与深拷贝 自行理解
        Person p1 = new Person("张三", 12, new Date());
        System.out.println("p1 = " + p1);
        Person clone = p1.clone();
        System.out.println("clone = " + clone);
    }
}
