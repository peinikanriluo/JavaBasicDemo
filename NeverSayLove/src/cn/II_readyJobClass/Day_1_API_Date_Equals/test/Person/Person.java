package cn.II_readyJobClass.Day_1_API_Date_Equals.test.Person;

public class Person {
    String name;
    int age;
    int height;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person() {

    }

    public Person(String name, int age, int height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }
}
