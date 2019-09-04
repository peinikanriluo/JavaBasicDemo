package cn.I_basic.day02;

public class BreakContinue {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("你是猪");
                break;
            case 2:
                System.out.println("人的惰性真的恐怖");
                break;
            default:
                System.out.println("1和2选一个");


        }
        int score = 110;
        if (score<=100&&score>=0) {
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("优秀");
                    break;
                case 8:
                    System.out.println("好");
                    break;
                case 7:
                    System.out.println("良");
                    break;
                case 6:
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("不及格");
            }
        }else System.out.println("您的成绩是自己打的么？");

        int ability = 452;
        if (ability <= 100 && ability >= 90) {
            System.out.println("优秀");
        } else if (ability < 90 && ability >= 80) {
            System.out.println("好");
        } else if (ability < 80 && ability >= 70) {
            System.out.println("良");
        } else if (ability < 70 && ability >= 60) {
            System.out.println("及格");
        } else if(ability<60&&ability>=0){
            System.out.println("不及格");
        }else if (ability <0) System.out.println("能不能不瞎打成绩，你成绩还能为负的？？？");
        else System.out.println("兄弟，满分一百分...你是要逆天么！");

        int num = 80;
        for (a = 1; a < num; a++) {
            System.out.print(" "+a);
        }
        System.out.println();
        if (a < 0 || a > 100) System.out.println("你的成绩是错误的");
        else if (a <= 100 && a >= 90) {
            System.out.println("优秀");
        } else if (a < 90 && a >= 80) {
            System.out.println("好");
        } else if (a < 80 && a >= 70) {
            System.out.println("良");
        } else if (a < 70 && a >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        System.out.println("求循环一到一百偶数和");
        int sum = 0;
        for (a = 2; a <= 100; sum = sum + a, a = a + 2) ;
        System.out.println("偶数和为" + sum + "\r\n" + "a的值为" + a);
        int amount = 1;
        sum = 0;
        for (; amount <= 100; amount++) {
            if (amount % 2 == 0) sum = sum + amount;
            else ;
        }
        System.out.println("nima臭嗨的偶数和为" + sum);
    }
}