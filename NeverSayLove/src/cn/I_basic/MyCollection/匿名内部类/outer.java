package cn.I_basic.MyCollection.匿名内部类;

public class outer {
   Abstract a;
   public void attrak(){
       System.out.println("巨龙撞击");
       a.skill();
   }


   class inner{
       Abstract a = new Abstract() {
           @Override
           public void skill() {
               System.out.println("内部类中的技能启用");
           }
       };
       public void skill(){

       }
    public void run(){
        outer.inner o = new outer().new inner();
        outer.this.a  = new Abstract() {
            @Override
            public void skill() {
                System.out.println("外部类中的技能启动");
            }
        };
        //这里的this.a指的就是a这个对象,默认省略，所以以前的写法中告诉你
        // 不用创建对象   outer可以理解为帮助this找到外部类的对象,
        // 所以内部类拿外部类成员需要创对象?不对,内部类类可以直接访问外部类
        // 成员,包括私有成员,只是你开始写的方式不对,不能拿外部类直接
        // 点变量名a;如果想写成this形式,就需要外部类名.this.变量名的格式。
        a.skill();
        outer.this.attrak();
   }
   }


    public static void main(String[] args) {
       new outer().new inner().run();
    }
}