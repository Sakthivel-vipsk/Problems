package org.JavaArrayPrograms;

import java.util.Arrays;

public class LargestThreeElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 34, 5, 67, 8, 9, 101};
        Arrays.sort(numbers);
        int n = numbers.length;
        System.out.println("Largest three Numbers \n 1. : " + numbers[n - 1] +
                " \n 2. : " + numbers[n - 2] +
                " \n 3. : " + numbers[n - 3]);

    }
}
