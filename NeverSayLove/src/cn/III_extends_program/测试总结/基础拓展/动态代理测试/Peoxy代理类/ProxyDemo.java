package cn.III_extends_program.测试总结.基础拓展.动态代理测试.Peoxy代理类;

import cn.III_extends_program.测试总结.基础拓展.动态代理测试.代理柳岩.LiuYan;
import cn.III_extends_program.测试总结.基础拓展.动态代理测试.代理柳岩.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class ProxyDemo {
    public static void main(String[] args) {
        //创建被代理对象
        final LiuYan ly = new LiuYan();
        //准备生产动态代理的函数的三个参数
        //获取类加载器
        ClassLoader loader = ly.getClass().getClassLoader();
        //获取被代理对象的接口
        Class[] interfaces = ly.getClass().getInterfaces();
        //调用处理器 修改代理对象拦截被代理对象的变量
        InvocationHandler h = new InvocationHandler() {
            // 代理类中的任何方法，其实内部都是执行了处理器中的invoke方法，无论是sing,liveShow，sleep都是这样
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /* proxy：就是代理对象本身。这里不用管！
                   method ： 当前代理对象正在被调用的方法的Method对象
                   args ：当前正在调用的方法的实际参数！ */
                // 实现代理的访问控制：
                // 获取当前正在调用的方法的名称：
                String name = method.getName();
                if ("sing".equals(name)) {
                    //sing函数参数只有一个获取第一个
                    double money = (double) args[0];
                    // 对money变量进行判断，修改访问参数
                    if (money < 100000) {
                        System.out.println("代理费不够呢");
                        return null;
                    }
                    System.out.println("我抽取了" + money * 0.2 + "元代理费用");
                    //执行LiuYan类中的函数
                    return method.invoke(ly, money * 0.8);
                }
                if ("liveShow".equals(name)) {
                    //liveShow函数参数只有一个获取第一个
                    double money = (double) args[0];
                    // 对money变量进行判断，修改访问参数
                    if (money < 500000) {
                        System.out.println("代理费不够呢");
                        return null;
                    }
                    System.out.println("我抽取了" + money * 0.2 + "元代理费用");
                    //执行LiuYan类中的函数
                    return method.invoke(ly, money * 0.8);
                }
//				System.out.println(args);//null 由于sleep函数没有参数所以args为null
                //执行LiuYan类中的sleep函数
                return method.invoke(ly, args);
            }
        };
        //获得代理对象
        //static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h)
        Star proxy = (Star) Proxy.newProxyInstance(loader, interfaces, h);//proxy表示动态获取的代理对象
        //使用代理对象调用函数
        System.out.println("输入唱歌提供的费用");
        proxy.sing(new Scanner(System.in).nextInt());
        System.out.println("-----------------------------------");
        System.out.println("输入现场秀提供的费用");
        proxy.liveShow(new Scanner(System.in).nextInt());
        System.out.println("-----------------------------------");
        proxy.sleep();
    }
}
