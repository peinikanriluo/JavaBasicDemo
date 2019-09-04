package cn.II_readyJobClass.Day_4_双列集合Map_初识异常;

public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            int[] a = null;
            System.out.println(a[1]);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("数组越界异常");
        }
    }
}