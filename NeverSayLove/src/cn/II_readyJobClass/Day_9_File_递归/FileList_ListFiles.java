package cn.II_readyJobClass.Day_9_File_递归;

import java.io.File;

public class FileList_ListFiles {
    public static void main(String[] args) {
        File f = new File("C:\\JAVAProjectProgram\\JavaProject\\NeverSayLove\\src\\cn\\I_basic\\day01");
        System.out.println("f.exists() = " + f.exists());
        String[] arr = f.list();
        System.out.println("返回String数组:arr = " + arr);
        System.out.println("便利String数组:");
        for (String s : arr) {
            System.out.println(s);
        }
        File[] file = f.listFiles();
        System.out.println("返回File类型数组:file = " + file);
        System.out.println("便利file数组");
        for (File file1 : file) {
            System.out.println(file1);
        }
    }
}
