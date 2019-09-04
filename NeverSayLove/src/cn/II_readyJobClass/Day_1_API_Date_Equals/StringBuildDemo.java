package cn.II_readyJobClass.Day_1_API_Date_Equals;

public class StringBuildDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        StringBuilder s = new StringBuilder("开始添加,");
        System.out.println(s);
        System.out.println(s.append("一号元素,").append("二号元素,").append("三号元素,").append("添加完成"));
    }
}
