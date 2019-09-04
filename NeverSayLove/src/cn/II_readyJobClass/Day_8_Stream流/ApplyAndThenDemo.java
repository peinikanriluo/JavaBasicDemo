package cn.II_readyJobClass.Day_8_Stream流;

import java.util.Scanner;
import java.util.function.Function;

public class ApplyAndThenDemo {
    /*1. 将字符串截取数字年龄部分，得到字符串；
2. 将上一步的字符串转换成为int类型的数字；
3. 将上一步的int数字累加100，得到结果int数字。
*/
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("请输入姓名,年龄");
            String s = new Scanner(System.in).next();
            try {
                System.out.println("年龄加100为" + method(
                        a -> a.split(",")[1],
                        a -> Integer.parseInt(a),
                        a -> a += 100, s));
            }catch (Exception e ){ System.out.println("年龄格式有误,请重新输入");}
        }
    }

    private static int method(Function<String, String> f1,
                              Function<String, Integer> f2,
                              Function<Integer, Integer> f3, String s) {
        int num = f1.andThen(f2).andThen(f3).apply(s);
        return num;
    }

}
