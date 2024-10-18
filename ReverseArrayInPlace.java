package org.JavaArrayPrograms;
import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArray(arr); // Call the reverse function

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Function to reverse the array in place
    public static void reverseArray(int[] array) {
        int left = 0; // Pointer at the beginning
        int right = array.length - 1; // Pointer at the end

        // Swap elements from both ends until the middle is reached
        while (left < right) {
            // Swap array[left] and array[right]
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
