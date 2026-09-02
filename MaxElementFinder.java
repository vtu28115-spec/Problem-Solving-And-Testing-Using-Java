
import java.util.Arrays;

public class MaxElementFinder {

    /**
     * Finds the maximum element in an array of integers.
     * @param arr The input array of integers.
     * @return The maximum integer value found in the array.
     * @throws IllegalArgumentException If the array is empty or null.
     */
    public static int findMaximum(int[] arr) {
        // Validate input to handle edge cases safely
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        // Initialize max with the first element of the array
        int max = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max if a larger element is encountered
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Sample array of n integers
        int[] numbers = {12, 45, 93, 7, 34, 88};
        
        System.out.println("Input Array: " + Arrays.toString(numbers));
        
        try {
            int maxVal = findMaximum(numbers);
            System.out.println("The maximum element is: " + maxVal);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
