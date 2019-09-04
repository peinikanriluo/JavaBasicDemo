package cn.II_readyJobClass.Day_9_File_递归;


import java.io.File;

public class DiGuixianxiang {
    public static void main(String[] args) {
        File f = new File("g:/新建文件夹");
//        System.out.println(f.exists());
//        System.out.println(f.mkdirs());
        methoddel(f);
    }

    private static void methoddel(File f) {
        System.out.println(f.listFiles().length);

        for (File file : f.listFiles()) {
            if (file.isFile()) {
                file.delete();
            } else {
                methoddel(file);
            }
        }
        System.out.println(f.delete());
    }
}
