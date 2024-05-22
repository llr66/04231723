package ex10.test01;

class Pupil {
    private String id, name;//学生学号与姓名
    private double score;//学生成绩

    public Pupil(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + score + " ";
    }
}
