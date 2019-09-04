package cn.I_basic.homework.RedRay红外线;

import java.util.Scanner;

public class RemoteControl {
    public void control(TV tv){
        System.out.println("遥控器控制电视");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入想看的电视节目");
        tv.play(s.next());
    }
}
