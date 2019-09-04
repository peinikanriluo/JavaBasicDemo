package cn.II_readyJobClass.Day_1_API_Date_Equals;

public class ToStringMethodExtends extends Object {
    @Override
    public String toString() {
        return "父类toString方法调用";
    }

    public static void main(String[] args) {
        ToStringMethodExtends.day101 d = new ToStringMethodExtends().new day101();
        d.run();
    }
    class day101 extends ToStringMethodExtends {
        public String toString(){
            System.out.println("内部子类 toString方法打印");
            return "------------------------------";
        }
       public void run(){
           System.out.println(toString());
           System.out.println(super.toString());
       }
    }
}
