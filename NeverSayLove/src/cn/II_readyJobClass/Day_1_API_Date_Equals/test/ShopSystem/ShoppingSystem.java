package cn.II_readyJobClass.Day_1_API_Date_Equals.test.ShopSystem;

import java.util.Scanner;

public class ShoppingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //创建商品数组
        goods[] shop = new goods[4];
        //赋值
        shop[0] = (new goods("少林核桃", "001", 15.5, '斤'));
        shop[1] = (new goods("饼干", "002", 453.3, '吨'));
        shop[2] = (new goods("硬盘", "003", 77.5, '个'));
        shop[3] = (new goods("高清无码", "004", 23.3, '片'));
        String first = null;
        for (; ; ) {
            System.out.println("情输入你要进行的操作:\r\n" +
                    "1:购买商品         2:结算并打印小票       3:退出系统");
            first = s.next();
            if (first.equals("1"))
                buy(shop);
            else if (first.equals("2"))
                sum(shop);
            else if (first.equals("3")) {
                System.out.println("系统已退出,感谢您的使用!!");
                break;
            } else System.out.println("输入有误!!");
        }
    }

    private static void sum(goods[] shop) {
        System.out.println("欢迎光临");
        for (int i = 0; i < shop.length; i++) {
            if (shop[i].sum > 0)
                System.out.println(shop[i].name + "   " + shop[i].price + "   " + shop[i].sum + " " + shop[i].price * shop[i].sum);
        }

    }

    private static void buy(goods[] shop) {
        Scanner s = new Scanner(System.in);
        String in;
        String[] i;
        String ii;
        int a;

        System.out.println("            商品列表    \r\n" +
                "id        名称      单价      计价单位\r\n" +
                "001      " + shop[0].name + "   " + shop[0].price + "   " + shop[0].unit + "\r\n" +
                "002      " + shop[1].name + "   " + shop[1].price + "   " + shop[1].unit + "\r\n" +
                "003      " + shop[2].name + "   " + shop[2].price + "   " + shop[2].unit + "\r\n" +
                "004      " + shop[3].name + "   " + shop[3].price + "   " + shop[3].unit + "\r\n"
        );

        System.out.println("请输入你要购买的商品项:(格式 00X-XX)");
        for (; ; ) {
            in = s.next();
            if (in.contains("001-")) {
                i = in.split("-");
                ii = i[1];
                a = Integer.parseInt(ii);
                shop[0].sum += a;
                System.out.println("购买成功,请继续选择或者输入'end'回主界面");
            } else if (in.contains("002-")) {
                i = in.split("-");
                ii = i[1];
                a = Integer.parseInt(ii);
                shop[1].sum += a;
                System.out.println("购买成功,请继续选择或者输入'end'回主界面");
            } else if (in.contains("003-")) {
                i = in.split("-");
                ii = i[1];
                a = Integer.parseInt(ii);
                shop[2].sum += a;
                System.out.println("购买成功,请继续选择或者输入'end'回主界面");
            } else if (in.contains("004-")) {
                i = in.split("-");
                ii = i[1];
                a = Integer.parseInt(ii);
                shop[3].sum += a;
                System.out.println("购买成功,请继续选择或者输入'end'回主界面");
            } else if (in.equals("end")) break;
            else System.out.println("输入格式有误!!请重新输入");
        }

    }
}