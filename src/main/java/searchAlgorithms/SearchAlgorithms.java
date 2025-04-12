package searchAlgorithms;

public class SearchAlgorithms {
    public static int binarySearch(int[] array, int target) {
        int left = 0; // Starting index of the array
        int right = array.length - 1; // Last index of the array.

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Target has been found.
            } else if (target > array[mid]) {
                left = mid + 1; // Look into right half.
            } else {
                right = mid - 1; // Look into left half.
            }
        }

        // Element has not been found.
        return -1;
    }
}
