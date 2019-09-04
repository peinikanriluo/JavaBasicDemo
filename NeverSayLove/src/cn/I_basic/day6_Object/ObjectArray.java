package cn.I_basic.day6_Object;

class Love {
    private String name;
    private int age;

    public Love(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Love() {

    }
}

public class ObjectArray {
    public static void main(String[] args) {
        Love[] arr = new Love[3];
         arr[0] = new Love("wpq", 23);
         arr[1] = new Love("wx", 24);
         arr[2] = new Love("xyj", 85);
//        arr[0]=person;//全是地址值
//        arr[1]=person2;
//        arr[2]= person3;
        System.out.println(arr[0].getName()+"   "+ arr[0].getAge());
        System.out.println(arr[1].getName()+"   "+arr[1].getAge());
        System.out.println(arr[2].getName()+"   "+arr[2].getAge());

    }
}
