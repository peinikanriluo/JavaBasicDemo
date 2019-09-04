package cn.II_readyJobClass.Day_00_小程序_文件删除查看复制;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FilecycleDemo {
    public static void Filecycle(File f,String name) throws IOException {
        File fd = new File("c:");
//        System.out.println(fd.getAbsolutePath());
//        System.out.println("fd.exists() = " + fd.exists());

        try {
            methodCheck(f,fd,  new Myfilter() {
                @Override
                public boolean judge(String a) {
                    return a.equals(name);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();//因检查盘符存在隐藏文件,需要添加非空判断
        }

    }
    static Scanner s= new Scanner(System.in);
    private static void methodCheck(File f,File fd,Myfilter myfilter) throws InterruptedException {
        if (fd.list()==null) {//判断盘符是否存在隐藏文件夹
            return;
        }
        for (File file : fd.listFiles()) {
            if (file.isFile()) {
                if (myfilter.judge(file.getName())){
                    System.out.println("找到文件,打印文件信息");
                    System.out.println("file.getParent() = " + file.getParent());
                    System.out.println(file.getName()+" 大小为"+file.length()+"    开始复制");
                    f = f.getParentFile();
                    file = new File(file.getName());
                    file.mkdirs();
                    FileCopyDemo.DiguiMethod(f,file,new Random());
                    System.out.println("程序复制成功,按任意键继续...");
                    s.nextLine();
                    return;
//                    System.out.println("file.delete() = " + file.delete());
                }
            } else methodCheck(f,file,myfilter);
        }
        System.err.println("检测成功 " + fd.getPath());
    }
}
interface Myfilter {
    boolean judge(String a);
}
