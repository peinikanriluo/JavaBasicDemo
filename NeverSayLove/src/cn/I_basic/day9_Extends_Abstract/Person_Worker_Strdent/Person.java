package cn.I_basic.day9_Extends_Abstract.Person_Worker_Strdent;

public class Person {
    String name;
    String gender;
    int age;
    String nationality;
    public void eat(){

    }
    public void sleep(){

    }
    public  void work(){
        System.out.println();
        System.out.print(name+"的工作是");
    }

    public Person() {
    }

    public Person(String name, String gender, int age, String nationality) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

