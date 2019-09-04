package cn.III_extends_program.测试总结.基础拓展.clone和new;

import java.util.Date;

/**
 * @author taoqi
 * @date 2019/8/2
 */
public class Person implements Cloneable{
    private String name;
    private int age;
    private Date birthday;
    @Override
    protected Person clone(){
        Person person;
        try {
            person = (Person)super.clone();
        return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
