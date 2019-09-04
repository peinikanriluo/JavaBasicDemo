package cn.I_basic.Test.测试继承构造方法;

public class Zi extends Fu {
    int i;
    public Zi(){
       super(99);
        System.out.println("子类空参构造函数执行");
    }
    public Zi(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.i);
    }
}
