/**
 * @author YasinBou on GitHub.
 * <p>
 * The goal of this application is to practise Algorithms and Data Structures.
 */
public class Main {
    public static void main(String[] args) {
        multiDimensionalArrayOutput();
    }

    private static void multiDimensionalArrayOutput() {
        MultiDimensionalArraysPractise<String> animals = new MultiDimensionalArraysPractise<>(new String[][][]{
                {{"cow"}, {"pig"}, {"sheep"}, {"chicken"}},
                {{"horse"}, {"goat"}, {"cow"}, {"sheep"}},
                {{"pig"}, {"chicken"}, {"goat"}, {"horse"}}
        });

        // Prints specific animal.
        String sheep = animals.getElement(0, 2);
        System.out.println(sheep);

        System.out.println("------------------------------");

        // Prints all animals.
        animals.printAllElements();

        System.out.println("------------------------------");

        // Replaces the cow element with a dog.
        animals.replaceElement(0, 0, "dog");
        animals.printAllElements();

        System.out.println("------------------------------");

        // Swaps the dog with the pig.
        animals.swapElements(0, 0, 0, 1);
        animals.printAllElements();

        System.out.println("------------------------------");
    }
}