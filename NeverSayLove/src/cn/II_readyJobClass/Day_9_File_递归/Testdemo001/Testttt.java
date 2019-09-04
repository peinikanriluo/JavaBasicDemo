package cn.II_readyJobClass.Day_9_File_递归.Testdemo001;

import java.io.File;

public class Testttt {
    public static void main(String[] args) {
        File f = new File("src");
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        System.out.println("f.exists() = " + f.exists());
        System.out.println("f.delete() = " + f.delete());
    }
}
