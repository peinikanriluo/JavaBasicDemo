package cn.II_readyJobClass.Day_5_异常检测.疼痛异常体系_尚未完成;

public class ZiTestPainException extends TestPainException {

    @Override
    public void eat() throws ToothPainException {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }
}
