package cn.III_extends_program.算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 出卖耶稣的人 {
    /*耶稣有13个门徒,其中有一个就是出卖耶稣的人,报数,1,2,3,1,2,3,1,2,3...
    凡是报到3的就退出圈子,最后留在圈中的就是出卖耶稣的叛徒,请找出它原来的序号.*/
    public static void main(String[] args) {
        Map<Integer, Boolean> map = new HashMap<>();
        int count = 0; // 报数
        while (true) {
            //假定门徒序号为 1-13
            for (int i1 = 1; i1 <= 13; i1++) {
                if (map.containsKey(i1)) {
                    continue;
                }
                if (map.size() == 12) {
                    System.out.println("出卖耶稣的叛徒: " + i1+"号");
                    System.out.println("map = " + map);
                    return;
                }
                count++;
                if (count == 3) {
                    map.put(i1, false);
                    count = 0;
                }
            }
        }
    }
}
