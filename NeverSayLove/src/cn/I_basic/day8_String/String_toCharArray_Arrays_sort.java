package cn.I_basic.day8_String;

///升序排列倒序打印
public class String_toCharArray_Arrays_sort {
    public static void main(String[] args) {
        String ran = ("fiewjf4oi34u8jf4ijtqo43jioj159ujf4eawjf4;oasigjsoadgojf4pojreiwjf4ipewojrjf4jfpaifewjjf4fjioajfoeajf4jfoieajfjf4jofiesjifjf4jifejifjf4eiwajfirj34rjf4");
        String a = "jf4";
        int b=0;
        for(;;){
            if (ran.indexOf(a)!=-1){
                ran=ran.substring(ran.indexOf(a)+a.length());
                b++;
                System.out.println("ran = " + ran);
            }else break;
        }
        System.out.println(b);

    }
}
