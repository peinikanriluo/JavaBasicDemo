package cn.II_readyJobClass.Day_9_File_递归;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------------------------------------");
        File f2 = new File("E:\\JavaProject\\NeverSayLove\\src\\cn\\I_basic\\day01\\boolean.java");
        System.out.println("返回此File的绝对路径名字符串。\r\n   "+f2.getAbsolutePath());
        System.out.println("将此File转换为路径名字符串。 \n" +
                "  "+f2.getPath());
        System.out.println("返回由此File表示的文件或目录的名称\n" +
                "   "+f2.getName());
        System.out.println("此File表示的文件或目录是否实际存在。\n" +
                "   "+f2.exists());
        System.out.println("是否为目录 \n" +
                "  "+f2.isDirectory());
        System.out.println("是否为文件 \n" +
                "  "+f2.isFile());
        System.out.println("返回由此File表示的文件的长度。\n" +
                "   "+f2.length());
        System.out.println("-------------------------------------------------------");
        File f = new File("aaa.java");
        System.out.println("\"aaa.java\"绝对路径位置\n" +
                " "+f.getAbsolutePath());
        System.out.println("\"aaa.java\"是否存在:\n" +
                " "+f.exists());
        System.out.println("是否创建\"aaa.java\"成功:\n" +
                " "+f.createNewFile());
        System.out.println("f.delete() = " + f.delete());
        File fa = new File("aaa.txt");
        System.out.println("aaa.txt是否存在:\n" +
                " "+fa.exists());
        System.out.println("fa.delete() = " + fa.delete());
        System.out.println("------------------------------------------------------");
        File dirfile = new File("陪你看日落");
        System.out.println("创建由此\"陪你看日落\"表示的目录。\n" +
                " "+dirfile.mkdir());
        System.out.println("dirfile.delete() /* 删除\"陪你看日落\"目录 */ ="+dirfile.delete());
        System.out.println("创建由此File表示的目录，包括任何必需但不存在的父目录。\n" +
                " dirfile.mkdirs() = " + dirfile.mkdirs());
        System.out.println("dirfile.delete() = " + dirfile.delete());
    }
}
