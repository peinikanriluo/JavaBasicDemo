package cn.I_basic.homework.RedRay红外线;

import java.util.Scanner;

public class Phone implements RedRay {
    @Override
    public void controlTV(TV tv) {
        System.out.println("手机开启红外线功能,控制电视");
        System.out.println("请输入键盘您想要看的电视节目");
        Scanner s = new Scanner(System.in);
        tv.play(s.next());
    }

}
