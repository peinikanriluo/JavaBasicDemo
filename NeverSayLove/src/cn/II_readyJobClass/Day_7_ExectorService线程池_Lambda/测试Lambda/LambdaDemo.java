package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.测试Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println(method((a, b) -> a + b));
    }

    private static int method (plus plu) {
        int result = plu.plu(5,6);
        return result;
    }
}
interface plus{
    public abstract int plu(int a ,int b );
}
