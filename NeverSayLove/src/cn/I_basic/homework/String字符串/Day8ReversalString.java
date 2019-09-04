package cn.I_basic.homework.String字符串;

/*字符串反转
	 举例：键盘录入”abc”
	 输出结果：”cba”
	 分析：
 		A:键盘录入一个字符串
 		B:写方法实现字符串的反转
 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
 		C:调用方法
 		D:输出结果

 */
import java.util.Scanner;

public class Day8ReversalString {
    public static void main(String[] args) {
        System.out.println("请输入要反转的字符串");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        reversal(st);
        char[] ch = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            ch[i]=st.charAt(i);
        }
        char[] rech = new char[st.length()];
        for (int i = ch.length - 1; i >= 0; i--) {
            rech[ch.length-1-i]=ch[i];
        }
        String sttt = new String(rech);
        System.out.println( sttt);

    }

    public static  void reversal(String st){
        char[]ch = new char[st.length()];
        String strr="";
        for (int i = 0; i < st.length(); i++) {
             ch[i]=st.charAt(i);
        }
        for (int i = ch.length - 1; i >= 0; i--) {
            strr=strr+ch[i];
        }
        System.out.println("strr = " + strr);
    }
}

