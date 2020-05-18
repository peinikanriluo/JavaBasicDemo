package cn.I_basic.MyCollection.StudentManage_String_;

import org.junit.Test;

import java.util.List;

/**
 * @Author: taoqi
 * @Date: 2020/5/17 0017 23:07
 * @Description: cn.I_basic.MyCollection.StudentManage_String_
 */
public class TestStudentDataSource {
    @Test
    public void test01() {
        List<StudentDataSource> allStudentData = StudentDataSource.JIA.getAllStudentData();
        System.out.println("allStudentData = " + allStudentData);
    }
}
