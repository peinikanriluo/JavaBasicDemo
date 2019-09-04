package cn.II_readyJobClass.Day_5_异常检测;

public class NoRegistException extends RuntimeException {
    public NoRegistException(String s) {
        super("有问题兄弟");
    }
}
