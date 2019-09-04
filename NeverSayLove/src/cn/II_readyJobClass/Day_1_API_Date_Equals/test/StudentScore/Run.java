package cn.II_readyJobClass.Day_1_API_Date_Equals.test.StudentScore;

import java.util.ArrayList;

public class Run {
    static ArrayList<Students> arr = new ArrayList<Students>();
    public static void main(String[] args) {
        Students s1 = new Students("狗子",234);
        Students s2 = new Students("狗",111);
        Students s3 = new Students("狗zizi",654);
        Students s4 = new Students("狗yaya",2354);
        Students s5 = new Students("goubaobao",432);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
        int sum = 0;
        int ave = 0;
        int high = arr.get(0).getScore();
        int low = arr.get(0).getScore();
        for (Students students : arr) {
            high = students.getScore()>high?students.getScore():high;
        }
        for (Students students : arr) {
            low = students.getScore()<low?students.getScore():low;
        }for (Students students : arr) {
            ave += students.getScore();
        }ave=ave/arr.size();
        for (Students students : arr) {
            sum +=students.getScore();
        }
        System.out.println(high+"   "+low+" "+ave+"     "+sum);
        for (Students students : arr) {
            System.out.println(students);
        }
    }
}
