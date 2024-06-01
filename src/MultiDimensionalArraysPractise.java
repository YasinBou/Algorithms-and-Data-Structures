/**
 * @author YasinBou on GitHub.
 *
 * This class contains helper methods for multidimensional arrays.
 */

public class MultiDimensionalArraysPractise<T> {
    private final T[][][] multiDimensionalArray;

    public MultiDimensionalArraysPractise(T[][][] multiDimensionalArray) {
        this.multiDimensionalArray = multiDimensionalArray;
    }

    /**
     * Returns an element inside the multidimensional array according to the x and y axes.
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @param z Depth axis.
     * @return The element at the specified coordinates.
     */
    public T getElement(int x, int y, int z) {
        this.validateIndices(x, y, z);
        return this.multiDimensionalArray[x][y][z];
    }

    /**
     * Will replace an element within the specified index.
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @param z Depth axis.
     * @param element Generic type that will switch with the previous element.
     * @return
     */
    public T replaceElement(int x, int y, int z, T element) {
        this.validateIndices(x, y, z);
        return this.multiDimensionalArray[x][y][z] = element;
    }

    /**
     * Swaps two elements within the array.
     * @param firstX x-position of the element to be swapped.
     * @param firstY y-position of the element to be swapped.
     * @param firstZ z-position of the element to be swapped.
     * @param secondX x-position of the second element that you want to swap with the first element.
     * @param secondY y-position of the second element that you want to swap with the first element.
     * @param secondZ z-position of the second element that you want to swap with the first element.
     */
    public void swapElements(int firstX, int firstY, int firstZ, int secondX, int secondY, int secondZ) {
        this.validateIndices(firstX, firstY, firstZ);
        this.validateIndices(secondX, secondY, secondZ);

        // Store element to be swapped
        T firstElement = this.getElement(firstX, firstY, firstZ);
        T secondElement = this.getElement(secondX, secondY, secondZ);

        // Swaps the firstElement with the secondElement.
        this.multiDimensionalArray[firstX][firstY][firstZ] = secondElement;
        this.multiDimensionalArray[secondX][secondY][secondZ] = firstElement;
    }

    public void insertAtPosition(int x, int y, T element) {

    }

    /**
     * This method preforms custom exception handling
     * in case of inices being out of bound.
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @param z Depth axis.
     */
    private void validateIndices(int x, int y, int z) {
        if (x < 0 || x > this.multiDimensionalArray.length ||
            y < 0 || y > this.multiDimensionalArray[x].length ||
            z < 0 || z > this.multiDimensionalArray[x][y].length) {
            throw new IndexOutOfBoundsException("Invalid indices: (" + x + ", " + y +", " + z +")");
        }
    }

    /**
     * Prints out all the elements inside the multidimensional array in order.
     */
    public void printAllElements() {
        for (int x = 0; x < this.multiDimensionalArray.length; x++) {
            for (int y = 0; y < this.multiDimensionalArray[x].length; y++) {
                for (int z = 0; z < this.multiDimensionalArray[x][y].length; z++) {
                    System.out.println(this.multiDimensionalArray[x][y][z]);
                }
            }
        }
    }
}
