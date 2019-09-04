package cn.I_basic.day10_Interface_Implements.Laptop_USBInterface;

public class Laptop{
    public void open(){
        System.out.println("开机");
    }
    public  void close(){
        System.out.println("关机");
    }
    public void run(USB a){
        if(a instanceof Mouse){
            ((Mouse)a).open();
            ((Mouse)a).close();
        }
        else if(a instanceof Keyboard){
            ((Keyboard)a).open();
            ((Keyboard)a).close();
        }
        else System.out.println("无法识别");
    }

}
