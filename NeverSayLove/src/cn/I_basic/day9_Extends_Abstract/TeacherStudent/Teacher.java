package cn.I_basic.day9_Extends_Abstract.TeacherStudent;

public class Teacher extends  School{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    public void teach(){
        System.out.println(getName()+ "正在讲课");
    }
    public void  eat(){
        super.eat();
        System.out.println("打着飞机");
    }
}
