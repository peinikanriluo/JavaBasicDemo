package cn.II_readyJobClass.Day_4_双列集合Map_初识异常;

import java.util.*;

public class TryCatchDemo {
    public static void main(String[] args) {
      Map<String,String> map = new HashMap();

      System.out.println("请输入格式为【姓名，年龄】的信息");
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
        String st = s.next();
        if(st.contains(",")&&st.split(",").length==2){
            String[] ch = st.split(",");
            try {
                int ii = Integer.parseInt(st.split(",")[1]);
            }catch (NumberFormatException c) {
                System.out.println("输入格式不正确（都好后方不能为非数字类型）,请重新输入");
              i--;
              continue;
            }
           String a = st.split(",")[1];
            map.put(st.split(",")[0],a);
            System.out.println("请接着输入");
        }else {
            System.out.println("输入错误请重新输入");
            i--;
        }

        }
        System.out.println(map);

    }
}
