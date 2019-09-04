package cn.II_readyJobClass.Day_8_Stream流;

import java.util.function.Function;

public class ApplayandThenFunction {
    public static void main(String[] args) {
        method( (f) -> Integer.parseInt(f),(a)->a*=10);
    }
    public static void method(Function<String,Integer> fun,Function<Integer,Integer> fun1){
        System.out.println(fun.andThen(fun1).apply("1")+1);
    }
}
