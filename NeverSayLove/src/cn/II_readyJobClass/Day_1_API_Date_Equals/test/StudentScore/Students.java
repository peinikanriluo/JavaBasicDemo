package cn.II_readyJobClass.Day_1_API_Date_Equals.test.StudentScore;

public class Students {
    String name ;
    int score;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Students() {

    }

    public Students(String name, int score) {

        this.name = name;
        this.score = score;
    }
}
