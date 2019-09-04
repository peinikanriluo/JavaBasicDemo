package cn.III_extends_program.面试题;

/**
 * @author taoqi
 * @date 2019/8/13
 */
public class test06 {
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str3";
        str1.concat(str2);
        System.out.println(str3.concat(str1));
        System.out.println("str3 = " + str3);
    }
}
