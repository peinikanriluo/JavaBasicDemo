package cn.II_readyJobClass.Day_4_双列集合Map_初识异常;



public class Arrajfijosdajif {
    public static void main(String[] args) {
        int a = 1;
       try{
           a = 4 /0;

       }catch (Exception e){
            int j = 4/0;
           System.out.println("youcuo");
       }finally {

          try {
              int b = 4/0;
          }catch (Exception e){

              System.out.println("youcuo");
          }
        System.out.println("nihao");
       }

    }
 }