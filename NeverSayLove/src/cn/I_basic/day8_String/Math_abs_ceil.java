package cn.I_basic.day8_String;

//-10.8到5.9之间 绝对值大于6或小于2.1的整数一共多少个。
public class Math_abs_ceil {
    public static void main(String[] args) {
        int num = 0;
        for (double i = Math.ceil(-10.8);i<= 5.9;i++ ){
            if (Math.abs(i)>6||Math.abs(i)<2.1){
                System.out.println("i = " + i);
                num++;
            }
        }
        System.out.println("num = " + num);
    }
}
