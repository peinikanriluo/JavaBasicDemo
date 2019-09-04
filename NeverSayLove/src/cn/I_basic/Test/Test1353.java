package cn.I_basic.Test;



public class Test1353 extends Object{
    String name ;
//    public String toString(){
//
//
//        return null;
//    }
    public static void main(String[] args) {
      String name = new String(new char[]{'奇','啊','奇'});
        Test1353 t = new Test1353();
        t.name="场景蚂蚁";
        System.out.println(t);
        System.out.println(t.toString());
//        在我们直接使用输出语句输出对象名的时候,其实通过该对象调用了其toString()方法

    }
}
