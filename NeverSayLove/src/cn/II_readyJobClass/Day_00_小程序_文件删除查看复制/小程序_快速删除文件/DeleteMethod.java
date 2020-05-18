package cn.II_readyJobClass.Day_00_小程序_文件删除查看复制.小程序_快速删除文件;

import java.io.File;

public class DeleteMethod {
    public static void main(String[] args) {
        File f = new File("E:\\JavaProject");
        for (int i = f.listFiles().length - 1; i >= 0; i--) {
            MyFilter mf = new MyFilter() {
                @Override
                public boolean filter(String a) {
                    return a.equals("tt.txt");
                }
            };
            judgeMethod(f.listFiles()[i], mf.filter(f.listFiles()[i].getName()), i);
        }
    }

    private static void judgeMethod(File file, boolean filter, int i) {
        if (filter) {
            System.out.println("111111111111111111");
            System.out.println("f.listFiles()[i].delete() = " + file.delete());
        }
    }
}

interface MyFilter {
    boolean filter(String a);
}
