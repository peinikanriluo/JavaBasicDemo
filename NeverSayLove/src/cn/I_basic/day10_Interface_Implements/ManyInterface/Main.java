package cn.I_basic.day10_Interface_Implements.ManyInterface;

public interface Main extends  A,b,c  {//接口继承接口.
    public default void method(){
            System.out.println("你们都是lowB");
        }
//继承的三个接口中有两个接口的默认方法相同,必须重写.

    public static void main(String[] args) {
        System.out.println("主函数在哪都是无所谓的!!");
    }
//    Main m = new Main();
//    .method();//接口不能被创建对象,要想使用接口中方法请去用子类实现.


}
