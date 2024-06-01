/**
 * @author YasinBou on GitHub.
 *
 * This class contains helper methods for multidimensional arrays.
 */

import java.util.Arrays;

public class MultiDimensionalArraysPractise<T> {
    private final T[][][] multiDimensionalArray;

    public MultiDimensionalArraysPractise(T[][][] multiDimensionalArray) {
        this.multiDimensionalArray = multiDimensionalArray;
    }

    /**
     * Returns an element inside the multidimensional array according to the x and y axes.
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @return The element at the specified coordinates.
     */
    public T getElement(int x, int y) {
        return this.multiDimensionalArray[x][y][0];
    }

    /**
     * Will replace an element within the specified index.
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @param element Generic type that will switch with the previous element.
     * @return
     */
    public T replaceElement(int x, int y, T element) {
        return this.multiDimensionalArray[x][y][0] = element;
    }

    /**
     * Swaps two elements within the array.
     * @param firstX x-position of the element to be swapped.
     * @param firstY y-position of the element to be swapped.
     * @param secondX x-position of the second element that you want to swap with the first element.
     * @param secondY y-position of the second element that you want to swap with the first element.
     */
    public void swapElements(int firstX, int firstY, int secondX, int secondY) {
        T firstElement = this.getElement(firstX, firstY);
        T secondElement = this.getElement(secondX, secondY);

        // Swaps the firstElement with the secondElement.
        this.multiDimensionalArray[firstX][firstY][0] = secondElement;
        this.multiDimensionalArray[secondX][secondY][0] = firstElement;
    }

    public void insertAtPosition(int x, int y, T element) {

    }

    /**
     * Prints out all the elements inside the multidimensional array in order.
     * The time complexity of this method is O(N^2) where N is the total number of elements
     */
    public void printAllElements() {
        for (int x = 0; x < this.multiDimensionalArray.length; x++) {
            for (int y = 0; y < this.multiDimensionalArray[x].length; y++) {
                System.out.println(Arrays.toString(this.multiDimensionalArray[x][y]));
            }
        }
    }
}
