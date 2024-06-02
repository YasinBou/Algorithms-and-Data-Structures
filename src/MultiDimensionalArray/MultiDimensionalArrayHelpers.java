package MultiDimensionalArray;

/**
 * @author YasinBou on GitHub.
 * This class contains helper methods for multidimensional arrays.
 */

public class MultiDimensionalArrayHelpers<T> {
    private final T[][][] multiDimensionalArray;

    public MultiDimensionalArrayHelpers(T[][][] multiDimensionalArray) {
        this.multiDimensionalArray = multiDimensionalArray;
    }

    /**
     * Returns an element inside the multidimensional array according to the x, y, and z axes.
     *
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
     *
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @param z Depth axis.
     * @param element The new element to be placed at the specified coordinates.
     * @return
     */
    public void replaceElement(int x, int y, int z, T element) {
        this.validateIndices(x, y, z);
        this.multiDimensionalArray[x][y][z] = element;
    }

    /**
     * Swaps two elements within the array.
     *
     * @param firstX  x-position of the first element to be swapped.
     * @param firstY  y-position of the first element to be swapped.
     * @param firstZ  z-position of the first element to be swapped.
     * @param secondX x-position of the second element to be swapped.
     * @param secondY y-position of the second element to be swapped.
     * @param secondZ z-position of the second element to be swapped.
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

    /**
     * Validates the provided indices to ensure they are within the bounds of the array.
     *
     * @param x Horizontal axis.
     * @param y Vertical axis.
     * @param z Depth axis.
     */
    private void validateIndices(int x, int y, int z) {
        if (x < 0 || x >= this.multiDimensionalArray.length ||
                y < 0 || y >= this.multiDimensionalArray[x].length ||
                z < 0 || z >= this.multiDimensionalArray[x][y].length) {
            throw new IndexOutOfBoundsException("Invalid indices: (" + x + ", " + y + ", " + z + ")");
        }
    }

    /**
     * Prints out all the elements inside the multidimensional array in order.
     */
    public void printAllElements() {
        for (int x = 0; x < this.multiDimensionalArray.length; x++) {
            for (int y = 0; y < this.multiDimensionalArray[x].length; y++) {
                for (int z = 0; z < this.multiDimensionalArray[x][y].length; z++) {
                    System.out.println("Element at (" + x + ", " + y + ", " + z + "): " + this.getElement(x, y, z));
                }
            }
        }
    }

    /**
     * Prints out all the elements inside the multidimensional array in reverse.
     */
    public void printAllElementsInReverse() {
        for (int x = this.multiDimensionalArray.length - 1; x >= 0; x--) {
            for (int y = this.multiDimensionalArray[x].length - 1; y >= 0; y--) {
                for (int z = this.multiDimensionalArray[x][y].length - 1; z >= 0; z--) {
                    System.out.println("Element at (" + x + ", " + y + ", " + z + "): " + this.getElement(x, y, z));
                }
            }
        }
    }
}