package arrayListImplementationTests;

import arrayListImplementation.ArrayListImplementation;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayListImplementationTests {
    private ArrayListImplementation<String> list = new ArrayListImplementation();

    @Test
    public void test_add() {
        // Make sure list is empty.
        int size = list.size();
        Assertions.assertEquals(size, 0);
        // Add element to list.
        list.add("chicken");
        // Check if size increased.
        Assertions.assertEquals(list.size(), 1);
        // Check if index 0 is equal to chicken.
        Assertions.assertEquals(list.get(0), "chicken");
    }

    @Test
    public void test_removeByIndex() {
        list.add("chicken");
        // Make sure size is 1.
        Assertions.assertEquals(list.size(), 1);
        // Remove element from list by index.
        list.remove(0);
        // Make sure size is 0.
        Assertions.assertEquals(list.size(), 0);
    }

    @Test
    public void test_removeByItem() {
        list.add("chicken");
        // Make sure size is 1.
        Assertions.assertEquals(list.size(), 1);
        // Remove element from list by item.
        list.remove("chicken");
        // Make sure size is 0.
        Assertions.assertEquals(list.size(), 0);
    }

    @Test
    public void test_listSize() {
        // Check if list is empty.
        Assertions.assertEquals(list.size(), 0);
        // Add element to list.
        list.add("chicken");
        // Check if size increased after element has been added.
        Assertions.assertEquals(list.size(), 1);
    }

    @Test
    public void test_getByIndex() {
        // Add elements to list.
        list.add("chicken");
        list.add("dog");
        list.add("wolf");
        list.add("bird");

        // Make sure elements align with their indices.
        Assertions.assertEquals(list.get(0), "chicken");
        Assertions.assertEquals(list.get(1), "dog");
        Assertions.assertEquals(list.get(2), "wolf");
        Assertions.assertEquals(list.get(3), "bird");
    }
}