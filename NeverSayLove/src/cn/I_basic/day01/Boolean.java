package cn.I_basic.day01;


public class Boolean {
    public static void main(String[] args) {
        boolean a = 1 == 1;
        boolean b = 2 == 4;
        System.out.println( a +"\n"+  b);

        for (int c=0;c<9;){
            c++;
        System.out.println(c);
        }
        System.out.println("===================");
//        System.out.println(c);//出错，c变量出了定义范围
        int i = 4 + 'a';
        System.out.println(i);
    }
}