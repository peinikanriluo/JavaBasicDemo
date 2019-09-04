package cn.I_basic.day03_Cycle;

public class JudgeEqualMethod {
    public static void main(String[] args) {
        System.out.println(equalJudge(20,20));
    }

    public static boolean equalJudge(int a,int b){
        System.out.println(a==b);
//        boolean c = a==b; / boolean c = a==b?true:false;
//        return c;
// 方法都可行 下面一行最简单
        return a==b;
    }
}