package cn.I_basic.Test;

public class OuterInner {
    public static void main(String[] args) {
        outer o = new outer();
        o.out();

        outer.inner d =o.new inner();
        d.in();
    }
}
class outer{
    private String st = "外部";
    public void out (){
        System.out.println(st);
    }
    public class inner{
        String str = "内部";
        public void in (){
            System.out.println(str);
        }
    }

}
