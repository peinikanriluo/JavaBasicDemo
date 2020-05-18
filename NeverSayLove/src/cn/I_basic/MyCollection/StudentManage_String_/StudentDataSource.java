package cn.I_basic.MyCollection.StudentManage_String_;

import cn.II_readyJobClass.Day_1_API_Date_Equals.test.StudentScore.Students;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: taoqi
 * @Date: 2020/5/17 0017 22:52
 * @Description: cn.I_basic.MyCollection.StudentManage_String_
 */
public enum StudentDataSource {
    JIA("甲","1","1","1")
    ,YI("乙","2","2","2")
    ,BING("丙","3","3","3")
    ,DING("丁","4","4","4");

    String name;
    String number;
    String age;
    String address;

    StudentDataSource(String name, String number, String age, String address) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.address = address;
    }

    public StudentInfo getCurrentStudent() {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setNumber(this.getNumber());
        studentInfo.setName(this.getName());
        studentInfo.setAddress(this.getAddress());
        studentInfo.setAge(this.getAge());
        return studentInfo;
    }

    @Override
    public String toString() {
        return "StudentDataSource{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public List<StudentDataSource> getAllStudentData() {
        ArrayList<StudentDataSource> students = new ArrayList<>();
        students.add(JIA);
        students.add(YI);
        students.add(BING);
        students.add(DING);
        return students;
    }
    public List<StudentInfo> getAllStudentInfos() {
        ArrayList<StudentInfo> students = new ArrayList<>();
        StudentInfo jia = new StudentInfo();
        jia.setName(JIA.getName());
        jia.setAge(JIA.getAge());
        jia.setAddress(JIA.getAddress());
        jia.setNumber(JIA.getAddress());
        students.add(jia);
        StudentInfo yi = new StudentInfo();
        yi.setName(YI.getName());
        yi.setAge(YI.getAge());
        yi.setAddress(YI.getAddress());
        yi.setNumber(YI.getAddress());
        students.add(yi);
//        students.add(BING);
//        students.add(DING);
        return students;
    }
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
