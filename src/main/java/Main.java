import OOP.Person;
import OOP.Student;
import OOP.Undergraduate;

/**
 * @author YasinBou on GitHub.
 * The goal of this application is to practise Algorithms and Data Structures.
 */

public class Main {
    public static void main(String[] args) {
        OOP();
    }

    private static void OOP() {
        // Inheritance
        Person person = new Person(1, "Yasin", "Yasin@hva.nl");
        Student student = new Student(1, "Yasin", "Yasin@hva.nl", 4.0);
        Undergraduate undergraduate = new Undergraduate(1, "Yasin", "Yasin@hva.nl", 4.0, 1);

        // Polymorphism
        Person undergrad = new Undergraduate(1, "Yasin", "Yasin@hva.nl", 4.0, 1);

        // Encapsulation
        undergraduate.getId();
        undergraduate.getName();
        undergraduate.getEmail();
        undergraduate.getGpa();
        undergraduate.getYear();
    }
}
