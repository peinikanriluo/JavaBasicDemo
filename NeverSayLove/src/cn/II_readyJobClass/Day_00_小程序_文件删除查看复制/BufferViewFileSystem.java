package cn.II_readyJobClass.Day_00_小程序_文件删除查看复制;


import java.io.File;
import java.util.Scanner;

public class BufferViewFileSystem {
    public static void main(String[] args) throws Exception {
        for (; ; ) {
            String c = "c:";
            File f1 = new File(c);
            String[] arr = f1.list();
            File[] filearr = f1.listFiles();
            System.out.println("即将遍历目录: " + c);
            Thread.sleep(500);
            System.out.println(3);
            Thread.sleep(500);
            System.out.println(2);
            Thread.sleep(500);
            System.out.println(1);
            try {
                OperateMethod(arr, filearr, f1);
                System.out.println("程序已退出,谢谢您的使用。");
                break;
            } catch (Exception e) {
                System.out.println("输入不合法,已返回主目录,请不要这样做了");
            }
        }
    }

    private static void OperateMethod(String[] arr, File[] filearr, File f1) throws Exception {
        lookDirector(arr, f1);
        Thread.sleep(1000);
        System.out.println("->请选择你需要的操作");
        for (; ; ) {
            String number = null;
            try {
                Scanner ss = new Scanner(System.in);
                number = ss.nextLine();
            } catch (Exception e) {
                System.out.println("输入有误!");
            }

            if (number.equals("B")) {
                File[] files = f1.getParentFile().listFiles();
                String[] list = f1.getParentFile().list();
                OperateMethod(list, files, f1.getParentFile());
                return;
            } else if (number.equals("E")) {
                return;
            } else if(number.startsWith("C")||number.startsWith("c")){
                int sequence;
                try {
                    sequence = Integer.parseInt(number.substring(1, number.length()));
                }catch (Exception e){
                    System.out.println("输入有误!");
                    continue;
                }
                if (sequence >= arr.length) {
                    System.out.println("输入超限!");
                } else {
                    for (int i = 0; i < filearr.length; i++) {
                        if (sequence==i) {
                            if (filearr[i].isFile()) {
                                System.out.println("您选中的是文件,文件名为: " + filearr[i].getName());
                                try {
                                    System.out.println("文件大小为:" + filearr[i].length() + " byte(1byte=8bit)");
                                } catch (Exception e) {
                                    System.out.println("当前内容信息不可见,请获取权限");

                                }
                                File f = filearr[i];
                                System.out.println("请输入要复制到的文件(非文件夹)的名称(C盘)");
                                Scanner sc1 = new Scanner(System.in);
                                String name = sc1.next();
                                FilecycleDemo.Filecycle(f,name);
                                System.out.println("程序复制成功,请选择继续操作或退出程序");
                                lookDirector(arr, f1);
                            } else {
                                try {
                                    System.out.println("选中文件夹:" + filearr[i].getName());
                                } catch (Exception e) {
                                    System.out.println("无权限!臣妾做不到");
                                }
                                System.out.println("请输入要复制到的文件(非文件夹)的名称(C盘)");
                                Scanner sc1 = new Scanner(System.in);
                                String name = sc1.next();
                                FilecycleDemo.Filecycle(filearr[i],name);
                                return;
                            }
                        }
                    }

                }


            }
            try {
                Integer.parseInt(number);
            } catch (Exception e) {
                System.out.println("输入有误,请按要求输入");
                continue;
            }
            if (Integer.parseInt(number) >= arr.length) {
                System.out.println("输入超限!");
            } else {
                for (int i = 0; i < filearr.length; i++) {
                    if (number.equals(i + "")) {
                        if (filearr[i].isFile()) {
                            System.out.println("您选中的是文件,文件名为: " + filearr[i].getName());
                            try {
                                System.out.println("文件大小为:" + filearr[i].length() + " byte(1byte=8bit)");
                            } catch (Exception e) {
                                System.out.println("当前内容不可见信息,请获取权限");
                            }
                            System.out.println("请继续选择本目录中您想要查看看的内容.");
                        } else {
                            File[] files = filearr[i].listFiles();
                            String[] list = filearr[i].list();
                            try {
                                System.out.println("选中文件夹:" + filearr[i].getName() + "\r\n正在进入查看文件夹内容.");
                            } catch (Exception e) {
                                System.out.println("无权限!臣妾做不到");
                            }
                            OperateMethod(list, files, filearr[i]);
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
        Thread.sleep(2000);
        for (int i = 0; i < arr.length; i++) {
            Thread.sleep(5);
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println(" ");
        System.out.println("B" + ":返回父目录" + f1.getParent());
        System.out.println("E" + ":退出程序");
        System.out.println("C+\"文件序号\""+":复制制定文件");
    }
}
