package cn.I_basic.day03_Cycle_Swich;

public class Remove9 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (i / 10 == 9) continue;
            if (i % 10 == 9) continue;
            if (a % 5 == 0) System.out.println();
            System.out.print(i + " ");
            a = a + 1;
        }
    }
}
