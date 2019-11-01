package Lesson_1030;

public class Student extends  Person{
    private int id;
    private double score;
    public Student(String name, int age) {
        super(name, age);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public void say() {
        super.say();
        System.out.println("My ID is "+this.id+" and score "+this.score);
    }
}
