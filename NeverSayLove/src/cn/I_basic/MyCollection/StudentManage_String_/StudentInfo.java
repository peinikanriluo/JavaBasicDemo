package cn.I_basic.MyCollection.StudentManage_String_;

public class StudentInfo {
    String name;
    String number;
    String age;
    String address;

    @Override
    public String toString() {
        return "学生信息\r\n" +
                "名字:" + name +
                ",  学号:" + number +
                ",  年龄:" + age +
                ",  地址:" + address
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
