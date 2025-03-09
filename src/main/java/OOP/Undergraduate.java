package OOP;

public class Undergraduate extends Student {
    int year;

    public Undergraduate(int id, String name, String email, double gpa, int year) {
        super(id, name, email, gpa);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
