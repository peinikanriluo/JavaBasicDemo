package cn.III_extends_program.算法;

import java.util.Scanner;

/**
 * @author taoqi
 * @date 2019/8/9
 */
public class 自定义金额转换 {
    /*金额转换，阿拉伯数字的金额转换成中国传统的形式如：（$1011）－>（一 千零一拾一元整）输出。 */
    public static void main(String[] args) {
        while (true) {
            System.out.println("输入传统形式金额（$1~$2100000000）: ");
            String next = new Scanner(System.in).next();
            checkMoney(next);
        }
    }

    private static void checkMoney(String next) {
        String money;
        if (next.startsWith("$")) {
            money = next.substring(1);
            System.out.println("money = " + money);
        } else {
            System.out.println("格式不正确！");
            return;
        }
        try {
            money = Integer.parseInt(money)+"";
//            if(money!=mn+""){
//                throw new RuntimeException("金额出错原因:"+"[money]"+money+"!= [(int)money]"+mn);
//            }
        } catch (Exception e) {
            System.out.println("金额出错，重新输入！");
            e.printStackTrace();
            return;
        }
        byte[] bytes = money.getBytes();
        String chineses = getChineses(bytes);
        if (chineses.endsWith("零")){
            chineses = chineses.substring(0,chineses.length()-1);
        }
        System.out.println("chineses = " + chineses+"美元");
    }

    private static String getChineses(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        int doubleZeroFlag = -1;
        for (int i = 0; i < bytes.length; i++) {
            if ((char) bytes[i] != '0'||bytes.length - i==5||bytes.length - i==9) {
                sb.append(getChinaNumber(bytes[i]));
                switch (bytes.length - i) {
                    case 10:
                        sb.append("十");
                        break;
                    case 9:
                        if (sb.toString().endsWith("零")){
                            sb = sb.delete(sb.length()-1,sb.length());
                        }
                        sb.append("亿");
                        break;
                    case 8:
                        sb.append("千");
                        break;
                    case 7:
                        sb.append("百");
                        break;
                    case 6:
                    case 2:
                        if(sb.length()==1&&sb.toString().endsWith("一")){
                            sb = sb.delete(sb.length()-1,sb.length());
                        }
                        sb.append("十");
                        break;
                    case 5:
                        if (sb.toString().endsWith("零")){
                            sb = sb.delete(sb.length()-1,sb.length());
                        }
                        sb.append("万");
                        break;
                    case 4:
                        sb.append("千");
                        break;
                    case 3:
                        sb.append("百");
                        break;
                    case 1:
                        sb.append("");
                }
            } else if (i != 0) {
                if (doubleZeroFlag + 1 != i) {
                    sb.append("零");
                }
                doubleZeroFlag = i;
            }
        }
        return sb.toString();
    }

    private static String getChinaNumber(byte number) {
        switch ((char) number) {
            case '0':
                return "";
            case '1':
                return "一";
            case '2':
                return "二";
            case '3':
                return "三";
            case '4':
                return "四";
            case '5':
                return "五";
            case '6':
                return "六";
            case '7':
                return "七";
            case '8':
                return "八";
            case '9':
                return "九";
        }

        return "未知";
    }
}
