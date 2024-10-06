package org.JavaArrayPrograms;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        boolean hasDuplicates = false;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break;  // Break the inner loop to avoid printing the same duplicate multiple times
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
