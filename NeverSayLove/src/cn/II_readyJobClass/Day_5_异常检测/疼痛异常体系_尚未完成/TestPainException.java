package cn.II_readyJobClass.Day_5_异常检测.疼痛异常体系_尚未完成;

public class TestPainException {
    public void eat() throws ToothPainException{
        System.out.println("吃到一个石子");
        throw new ToothPainException("牙疼不是病呀,疼起来真要命");
    }
    public  void  drink(){
        System.out.println("正在喝水");
    }

    public static void main(String[] args) {


    }
}
