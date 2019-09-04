package cn.II_readyJobClass.Day_5_异常检测;

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[]args){
        try {
            method11();
        }catch (Exception e ){
            e.printStackTrace();//空指针
            System.out.println("问题解决");
        }


    }

    private static void method11() throws Exception{
        Scanner s = new Scanner(System.in);
        String st = null;
           st.charAt(1);


    }
}
