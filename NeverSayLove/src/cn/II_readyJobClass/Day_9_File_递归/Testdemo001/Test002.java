package cn.II_readyJobClass.Day_9_File_递归.Testdemo001;

import java.io.File;

public class Test002 {
    public static void main(String[] args) {
        File f = new File("d:/日记本/删除/你好么/再见/001/002");
        System.out.println("f.exists() = " + f.exists());
        System.out.println("f.getPath() = " + f.getPath());
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        System.out.println("f.mkdirs() = " + f.mkdirs());
        System.out.println("打印新建文件夹");
        for (int i = 0; i < f.list().length; i++) {
            System.out.print(";     f[i] = " + f.list()[i]);
        }
        File fd = new File("d:/日记本/删除");
        System.out.println("fd.delete() = " + fd.delete());

        System.out.println();
        File f1 = new File("删除/哈哈");
        System.out.println("f1.getAbsolutePath() = " + f1.getAbsolutePath());
        System.out.println("f1.getPath() = " + f1.getPath());
        System.out.println("f1.exists() = " + f1.exists());

    }
}
