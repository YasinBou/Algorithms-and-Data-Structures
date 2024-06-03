package multiDimensionalArrayTests;

import multiDimensionalArray.MultiDimensionalArrayHelpers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MultiDimensionalArrayTests {

    private MultiDimensionalArrayHelpers<String> animals =  new MultiDimensionalArrayHelpers<>(new String[][][]{
            {{"cow"}, {"pig"}, {"sheep"}, {"chicken"}},
            {{"horse"}, {"goat"}, {"cow"}, {"sheep"}},
            {{"pig"}, {"chicken"}, {"goat"}, {"horse"}}
    });;

    @Test
    public void test_getElementById() {
        // Cow is at index (0, 0, 0).
        String cow = this.animals.getElement(0, 0, 0);
        Assertions.assertEquals("cow", cow);
    }

    @Test
    public void test_replaceElements() {
        String cow = this.animals.getElement(0, 0, 0);
        Assertions.assertEquals("cow", cow);

        // Cow is now replaced by dog.
        this.animals.replaceElement(0, 0, 0, "dog");
        String dog = this.animals.getElement(0, 0, 0);

        Assertions.assertEquals("dog", dog);
    }

    @Test
    public void test_swapElements() {
        // First element.
        String cow = this.animals.getElement(0, 0, 0);
        // Last element.
        String horse = this.animals.getElement(2, 3, 0);

        // Comparing to make sure they are equal to cow and horse.
        Assertions.assertEquals("cow", cow);
        Assertions.assertEquals("horse", horse);

        // Swapping them.
        this.animals.swapElements(0, 0, 0, 2, 3, 0);

        // Cow previously, it's a horse now.
        String previousCow = this.animals.getElement(0, 0, 0);
        // Horse previously, it's a cow now.
        String previousHorse = this.animals.getElement(2, 3, 0);

        // Elements are swapped, the index of horse is now equal to cow and vice versa.
        Assertions.assertEquals("horse", previousCow);
        Assertions.assertEquals("cow", previousHorse);
    }

    @Test
    public void test_getAllElements() {
        String elements = "Element at (0, 0, 0): cow\n" +
                "Element at (0, 1, 0): pig\n" +
                "Element at (0, 2, 0): sheep\n" +
                "Element at (0, 3, 0): chicken\n" +
                "Element at (1, 0, 0): horse\n" +
                "Element at (1, 1, 0): goat\n" +
                "Element at (1, 2, 0): cow\n" +
                "Element at (1, 3, 0): sheep\n" +
                "Element at (2, 0, 0): pig\n" +
                "Element at (2, 1, 0): chicken\n" +
                "Element at (2, 2, 0): goat\n" +
                "Element at (2, 3, 0): horse";

        String allElements = this.animals.getAllElementsAsString();
        Assertions.assertEquals(allElements, elements);
    }

    @Test
    public void test_getAllElementsInReverse() {
        String reversedElements = "Element at (2, 3, 0): horse\n" +
                "Element at (2, 2, 0): goat\n" +
                "Element at (2, 1, 0): chicken\n" +
                "Element at (2, 0, 0): pig\n" +
                "Element at (1, 3, 0): sheep\n" +
                "Element at (1, 2, 0): cow\n" +
                "Element at (1, 1, 0): goat\n" +
                "Element at (1, 0, 0): horse\n" +
                "Element at (0, 3, 0): chicken\n" +
                "Element at (0, 2, 0): sheep\n" +
                "Element at (0, 1, 0): pig\n" +
                "Element at (0, 0, 0): cow";

        String allElements = this.animals.getAllElementsInReverseAsString();
        Assertions.assertEquals(allElements, reversedElements);
    }
}
