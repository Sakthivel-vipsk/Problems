package org.JavaArrayPrograms;

import java.util.Scanner;

public class RemoveDuplicatesManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare and initialize the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Remove duplicates manually
        int[] tempArray = new int[size];
        int tempSize = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < tempSize; j++) {
                if (array[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[tempSize++] = array[i];
            }
        }

        // Print the array with duplicates removed
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < tempSize; i++) {
            System.out.print(tempArray[i] + " ");
        }
    }
}
