package cn.I_basic.day6_Object.StandardClass;

public class StandardClass {
    public void Student() {
        System.out.println("true = " + true);
    }

    public static void main(String[] args) {
//        Student Student = new Student();
//    构造器会默认给你构造无参方法
        System.out.println(Student.name);
        Student.name = "i can do";
        System.out.println(Student.name);
// Student.Age = 23;//不可定义，因为Student类中成员变量已经加了private
        System.out.println(Student.getAge());
        Student.setName("wpq");
        Student.setAge(24);
        System.out.println("Student() = " + (Student.getName() + Student.getAge()));
        StandardClass stu3 = new StandardClass();
        stu3.Student();//这里是调用同类的成员方法

//        Student stu2 = new Student("wpq", 23);//构造方法没有返回值，
// 方法名和类名一样，其作用是用于在NEW一个类的时候，会总先调用这个类的构造方法，
// 构造方法内部可以作一些变量的初始化或在创建这个类时必须调用的一些方法和运算，
// 他是不用特意去调用的方法，会随着类的创建而自动去调用
//        System.out.println("stu2.getAge()+stu2.getName() = " + stu2.getAge() + "; " + stu2.getName());
    }
}
//现在此类已经废掉；就是tm调用人家类的静态方法，而不再是成员和构造方法了。