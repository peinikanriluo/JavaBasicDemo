package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.测试Lambda;

public class KaiShuiDaBaiCai {
    public static void main(String[] args) {
        cook((dish)-> {System.out.println("香辣"+dish);});
        cook(dish-> System.out.println("水煮"+dish));
        cook(dish -> System.out.println("猪屎煮"+dish));
    }
    public static void cook(Add ad){
        ad.ad("大白菜");
    }
}
interface Add{
    public void ad(String dish);
}