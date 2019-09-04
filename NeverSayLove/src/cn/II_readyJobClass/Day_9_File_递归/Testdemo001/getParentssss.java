package cn.II_readyJobClass.Day_9_File_递归.Testdemo001;

import java.io.File;

public class getParentssss {
    public static void main(String[] args) {
        File f = new File("NeverSayLove/src/cn/I_basic/day01");
        System.out.println("f.getParent() = " + f.getParent());
        File fp = f.getParentFile();
    }
}
