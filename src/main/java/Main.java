import OOP.Person;
import OOP.Student;
import OOP.Undergraduate;
import Sorting.Sorting;
import searchAlgorithms.SearchAlgorithms;

/**
 * @author YasinBou on GitHub.
 * The goal of this application is to practise Algorithms and Data Structures.
 */

public class Main {
    public static void main(String[] args) {
        searchAlgorithms();
    }

    private static void searchAlgorithms() {
        int[] sortedList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(SearchAlgorithms.binarySearch(sortedList, 4));
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

        // Abstraction is displayed by using interfaces and abstract classes within the Cat and Dog ojects.
    }

    private static void sorting() {
        Sorting.sort();
    }
}
