package cn.II_readyJobClass.Day_5_异常检测.自定义异常_登录异常;

public class LoginException extends Exception{
    public LoginException() {
    }

    public LoginException(String message) {// 父类构造函数

        super(message);
    }
}
