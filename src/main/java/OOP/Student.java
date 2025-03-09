package OOP;

public class Student extends Person {
    double gpa;

    public Student(int id, String name, String email, double gpa) {
        super(id, name, email);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}