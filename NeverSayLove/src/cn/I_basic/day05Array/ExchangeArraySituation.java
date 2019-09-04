package cn.I_basic.day05Array;

public class ExchangeArraySituation {
    public static void main(String[] args) {
        int[] Exchange = {3243, 32412, 524135,  5463515, 43434245, 254, 22, 3};
        int a;
        for (int i = 0, j = Exchange.length-1; i <Exchange.length/2; i++, j--) {
            a = Exchange[j];
            Exchange[j] = Exchange[i];
            Exchange[i] = a;
        }
        for (int i = 0; i < Exchange.length; i++) {
            System.out.println(Exchange[i]);
        }
    }
}
