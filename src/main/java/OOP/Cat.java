package OOP;

public class Cat implements AnimalNoises {
    // Here we use the makeNoise method body and define it directly from our AnimalNoises interface.
    // An interface method body cannot be defined in the interface itself, it serves as a blueprint instead.
    @Override
    public void makeNoise() {
        System.out.println("Meow.");
    }
}
