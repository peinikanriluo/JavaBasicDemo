package cn.I_basic.day9_Extends_Abstract;


class Fu {
    public Fu(){
        System.out.println("父类构造方法运行");
    }
    String fu = "我是你粑粑";
    public void show() {
        System.out.println("Fu类中的show方法执行");
    }
    public  Fu(int a,int b){
        System.out.println("重载构造方法已经运行");
    }
}

class Zi extends Fu {
    //自动创造父类对象?
    int nima = 250;
    public Zi(){

        System.out.println("子类构造方法运行");
    }
    public Zi(int a ,int r){
        this();
//        super();????
        System.out.println("r = " + r);
        System.out.println("nima = " + a);
    }
    public void show() {
        super.show();
        System.out.println("Zi类中的show方法执行");
        //子类有show方法 只执行重写后的方法
    }
}

public class Extends {
    public static void main(String[] args) {
        Zi z = new Zi(23,341);
        //子类中没有show方法，但是可以找到父类方法去执行
        z.show();
        System.out.println(z.fu);
//        z.show2();
    }
}


