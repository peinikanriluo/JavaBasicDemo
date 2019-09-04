package cn.I_basic.day6_Object;

class OneDay {
    double getUp;
    double study;
    double eat;
    double drink;
    double clean;
    public void fighting() {
        System.out.println("加油！你是最棒的。你会让别人后悔");
    }
}


public class ReturnObject {
    public static void main(String[] args) {
        OneDay oneday = new OneDay();
//      OneDay oneday其实就是定义一个变量oneday（用于储存地址）给OneDay.后面可以直接接收方法地址
        System.out.println(oneday);
        oneday.getUp = 7.01;
        oneday.study = 8.00;
        oneday.eat = 7.40;
        oneday.drink = 7.50;
        oneday.clean = 23.00;
        System.out.println("" + oneday.clean +"\r\n"+ oneday.study+"\r\n" + oneday.drink+"\r\n" + oneday.eat +"\r\n"+ oneday.getUp);
        oneday.fighting();
        /*oneday=*/fanhui(oneday);
//      此时oneday的地址改变，所有储存的成员变量值和成员方法改变。如果没有底下的方法定义；将全部归零。
        System.out.println(oneday);
        System.out.println(oneday.getUp);
        System.out.println(oneday.study);
        System.out.println(oneday.clean);
        System.out.println(oneday.drink);
    }

    public static OneDay fanhui(OneDay zhufangfadizhi) {
//        OneDay change=new OneDay();
        OneDay change = zhufangfadizhi;
//      不能和上面主方法公用OneDay地址，因为不是同方法你也用不到（作用域不一样,因此变量也是可以定义相同的），可以自行拿到地址
//        值得注意的是拿到地址后改变其中变量数值会改变主方法中oneday对象
        System.out.println(change.getUp);
        System.out.println(change.study);
        change.getUp=99999999.00;
        change.study=11111112.00;
        return change;
    }

}
