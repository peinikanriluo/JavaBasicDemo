package cn.III_extends_program.算法;


/**
 * 一共十阶楼梯 , 每次只能爬一个或者两个台阶 , 一共多少种情况
 */
public class 递归楼梯情况 {
    public static void main(String[] args) {
       int count =  floorMethod(10);
//        int count = f1(10);
        System.out.println("count = " + count);
    }
    private static int floorMethod(int i) {
        if(i==1||i==0) return 1;
        return floorMethod(i-1)+floorMethod(i-2);
    }

    public static int f1(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return f1(n-1)+f1(n-2);
    }
}
