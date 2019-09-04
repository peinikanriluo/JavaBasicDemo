package cn.I_basic.day05Array;

public class MethodArrayDeliveryArgs {
    public static void main(String[] args) {
        int []array = new int []{3,3,3,3,3,3,3};
        int []shuZu = new int []{9,8,7,6,5,4,3};
        System.out.println("数组原始地址"+shuZu);
//        ChuanDiCanShu(array,shuZu);
        System.out.println("方法返回数组地址值是："+(ChuanDiCanShu ( array, shuZu)));
        System.out.println("====================");
        System.out.println("模版数组为");
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        }
        System.out.println();
//        System.out.println("方法返回数组地址值是："+ shuZu);
//        shuZu = ChuanDiCanShu(array,shuZu);
        System.out.println("数组零号位置是："+shuZu[0]);
    }
    public static int[] ChuanDiCanShu (int array[],int shuZu[]){
        System.out.println("模版数组为");
        for (int i = 0; i < array.length; i++) {
            array[i]++;
            System.out.print(array[i]);
        }
            shuZu=array;//为啥shuZu的地址值不变？而在主方法中运行会改变
        System.out.println();
        System.out.println("数组地址值是："+shuZu);//在ChuanDiCanShu方法中改变；主方法中改回去了
        System.out.println("数组零号位置是："+shuZu[0]);
        return shuZu;
        //总结，自定义方法只会在该方法中改变数组地址，只会说可以改变数组中所有的值；
        //而若想使用方法中的地址，需要从其返回值之中调用赋值
    }
}
