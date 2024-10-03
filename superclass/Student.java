package superclass;

public class Student extends Person {

    private int StudentNumber;
    private int Score;
    private String major;

    public Student(String name, int Age, String Major, int StudentNumber, int Score) {
        super(name, Age);
        this.StudentNumber = StudentNumber;
        this.Score = Score;
        this.major = major;
    }

    public int getStudentNumber() {
        return this.StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public int getScore() {
        return this.Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void print() {
        super.print();
        System.out.println("Student Number : " + StudentNumber);
        System.out.println("Score : " + Score);
        System.out.println("Major : " + major);
    }
}     

    
    
