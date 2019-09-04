package cn.II_readyJobClass.Day_1_API_Date_Equals;

public class Equals {
  
    public static void main(String[] args) {

        String a1 = new String("123");
        String a2 = "123";
        String a3 = "123";
        System.out.println(a1.equals(a2));//相等是因为字符串重写了toString,
        // 打印出来就是字符串本身的值(用循环一个一个字符查出来的).
        System.out.println(a1 == a2);//不相等是因为new出来不在常量池
        System.out.println(a2 == a3);//没有借鉴性,光看地址
        System.out.println(a1.equals(a3));

    }
}
