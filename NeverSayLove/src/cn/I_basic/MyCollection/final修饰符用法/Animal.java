package cn.I_basic.MyCollection.final修饰符用法;

class Animal {//final也可以修饰类表示不可进行继承了
    final int age;//可以直接赋值,但是不赋值就必须保证只赋值一次.
    String name;

    public Animal(){
        age =2;/*构造方法中定义final修饰的成员变量*/
    }
    public Animal(int age) {
        this.age = age;//可以没有参数构造,但是一旦写上
        //就必须给final修饰的变量赋值.无论何种参数构造.
    }
    public Animal(String name) {
        //即使是只给name赋值的参数构造也不行
        this.name = name;
        age = 2 ;//瞎写也得写一个.
    }

    public final/*final修饰方法不能被重写*/ void eat() {
        System.out.println("年龄为"+age+"的动物吃饭");

    }

}
