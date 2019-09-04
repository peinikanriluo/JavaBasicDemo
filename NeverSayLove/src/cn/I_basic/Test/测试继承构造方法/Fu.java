package cn.I_basic.Test.测试继承构造方法;

public class Fu {
    public Fu() {
        System.out.println("父类空参构造函数执行");
    }
    int i;
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Fu(int i) {
        System.out.println("父类全参构造函数运行");
        this.i = i;
    }

}
