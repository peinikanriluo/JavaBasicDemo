package cn.I_basic.homework;
/*请使用Math 相关的API，计算在 -10.8  到5.9  之间
，绝对值大于6  或者小于2.1 的整数有多少个？*/
public class MathAPI {
    public static void main(String[] args) {
        int num = 0;
     for(int a = (int) Math.ceil(-10.8);a<=Math.floor(5.9);a++){
         if(Math.abs(a)>6||Math.abs(a)<2.1) num++;
     }
        System.out.println("num = " + num);
    }
}
