package ex10.Test04;

public class Student implements Comparable {
    //姓名
    private String name;
    //分数
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student stu=(Student) o;
        return this.score- stu.score;
    }
}
