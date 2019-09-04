package cn.I_basic.MyCollection;

import java.util.Scanner;//导入录用工具包

/*进口*/
class TestScanner {
    public static void main(String[] args) {
        // 创建键盘录入器
        Scanner input = new Scanner(System.in);

        // 演示录入字符串数据
        System.out.print("请输入您的姓名：");

        // 使用键盘录入器输入字符串数据，赋值给name 阻塞式方式

        // 使用键盘录入器输入整数数据，赋值给age
        System.out.print("请输入您的年龄：");
        System.out.println("您的年龄是： " + input.nextInt());


        // 使用键盘录入器输入小数数据，赋值给左侧的变量空间
        System.out.print("请输入您的身高：");
        System.out.println("您的身高是： " + input.nextDouble());

        // 使用键盘录入器输入字符数据，赋值给sex
        System.out.print("请输入您的性别：");
        //input.next()读入一行字符串.charAt(0)是指这行字符串的第一个字符,然后赋值到name中
        System.out.println("您的性别是： " + input.next().charAt(0));

    }
}