package cn.II_readyJobClass.Day_7_ExectorService线程池_Lambda.HomeWork;

public class ThreeThreadArgs {
    public static void main(String[] args) {
        invokeDirect(()-> System.out.println("导演拍电影啦!!!!!!"));

    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
interface Director{
    void makeMovie();
}