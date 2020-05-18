package cn.II_readyJobClass.Day_00_小程序_文件删除查看复制;

import java.io.File;
import java.util.Scanner;

public class ViewFileSystem {
    public static void main(String[] args) throws Exception {
        for (; ; ) {
            String c = "c:";
            File f1 = new File(c);
            String[] arr = f1.list();
            File[] filearr = f1.listFiles();
            System.out.println("即将遍历目录: "+c);
            Thread.sleep(1000);
            System.out.println(3);
            Thread.sleep(1000);
            System.out.println(2);
            Thread.sleep(1000);
            System.out.println(1);
            Thread.sleep(1000);

                try {
                    deleteMethod(arr, filearr, f1);
                    System.out.println("程序已退出,谢谢您的使用。");
                    break;
                } catch (Exception e) {
                    System.out.println("输入不合法,请不要这样做了,已返回主目录");


            }
        }
    }

    private static void deleteMethod(String[] arr, File[] filearr, File f1) throws Exception {
        lookDirector(arr, f1);
        Thread.sleep(1000);
        System.out.println("->请选择你需要的操作( 查看 )");
        for (; ; ) {
            int number=0;
            try {
                Scanner ss = new Scanner(System.in);
                number = ss.nextInt();
            }catch (Exception e){
                System.out.println("请输入数字!");
            }

            if (number >= arr.length + 2) {
                System.out.println("输入有误,请重新输入");
            } else if (number == 0) {
                File[] files = f1.getParentFile().listFiles();
                String[] list = f1.getParentFile().list();
                deleteMethod(list, files, f1.getParentFile());
                return;
            } else if (number == 1) {
                return;
            } else {
                for (int i = 2; i < filearr.length + 2; i++) {
                    if (i == number && i < filearr.length + 2) {
                        if (filearr[i - 2].isFile()) {
                            System.out.println("您选中的是文件,文件名为: " + filearr[i - 2].getName());
                            try {
                            System.out.println("文件大小为:" + filearr[i].length() + " byte(1byte=8bit)");
                            }catch (Exception e ){
                                System.out.println("当前内容不可见信息,请获取权限");
                            }
                            System.out.println("请继续选择本目录中您想要查看看的内容.");
                        } else {
                            File[] files = filearr[i - 2].listFiles();
                            String[] list = filearr[i - 2].list();
                            try {
                                System.out.println("选中文件夹:" + filearr[i - 2].getName() + "\r\n正在进入查看文件夹内容.");
                            }catch (Exception e){
                                System.out.println("无权限!臣妾做不到");
                            }
                            deleteMethod(list, files, filearr[i - 2]);
                            return;
                        }
                    }
                }

            }

        }
    }

    private static void lookDirector(String[] arr, File f1) throws InterruptedException {
        if (arr.length == 0) {
            System.out.println("无文件");
            Thread.sleep(1000);
        }
        for (int i = 0; i < arr.length + 2; i++) {
            if (i > 1 && i < arr.length + 2) {
                Thread.sleep(5);
                System.out.println(i + ": " + arr[i - 2]);
            } else if (i == 0) {
                Thread.sleep(1000);
                System.out.println(i + ":返回父目录" + f1.getParent());
            } else if (i == 1) {
                System.out.println(i + ":退出程序");
                System.out.println(" ");
                Thread.sleep(1000);
            }
        }
    }
}
