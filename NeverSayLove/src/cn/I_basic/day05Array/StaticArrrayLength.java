
/*
* 获取数组的长度格式： 数组名称.length
* */
public class StaticArrrayLength {
    public static void main(String[] args) {
        int []arrayA=new int[3];
        int size=arrayA.length;
        System.out.println("arrayA的长度是: "+size);
        System.out.println("===================");

        int[]arrayB={23,432,2314,32,4,5,21,523,5,32,1};
        int len=arrayB.length;
        System.out.println("arrayB的长度是："+len);
        System.out.println("====================");
//  数组一旦创建，程序运行期间，长度不变。
        int []arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC=new int[5];
        System.out.println(arrayC.length);//5
//  数组指的是堆当中new出来的 而并不是前面的标识符
//  所以数组没有改变 知识new出一个长度为5的数组

    }
}
