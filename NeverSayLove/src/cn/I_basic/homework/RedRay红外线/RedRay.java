package cn.I_basic.homework.RedRay红外线;

public abstract/*可以省略*/ interface RedRay {
    public abstract void controlTV(TV tv);
    public default void connecting(){
        System.out.println("外接设备连接成功,可以使用红外线");
    }
}
