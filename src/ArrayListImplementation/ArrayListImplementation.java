package ArrayListImplementation;

/**
 * @author YasinBou on GitHub.
 * This class is an implementation of Java's ArrayList.
 */

public class ArrayListImplementation {
    private String[] array = new String[10];
    private int size = 0;

    /**
     * This method allows items to be added to the ArrayList.
     * It will double the size if the limit has been reached.
     * @param item item to be added within the ArrayList.
     */
    public void add(String item) {
        // Add item to specified index within the array.
        array[size] = item;
        // Increment size everytime a new item has been added.
        size++;
        // Check if the size has reached the limit.
        if (size == array.length) {
            // Create new array that is double in size (previousSize * 2).
            String[] increasedArray = new String[array.length * 2];
            // Adds all elements from our previous array into our increasedArray.
            for (int i = 0; i < array.length; i++) {
                increasedArray[i] = array[i];
            }
            // Array now has the same elements (including the one that has been newly added),
            // and an increase in size.
            array = increasedArray;
        }
    }
}
