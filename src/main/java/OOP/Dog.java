package OOP;

public class Dog extends AnimalNoises2 {
    // Here we define the makeNoise() method that we created in our abstract class.
    @Override
    public void makeNoise() {
        System.out.println("Woof.");
        // Or you can use the method with a body directly from the abstract class.
        bark();
    }
}
