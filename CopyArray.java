package org.JavaArrayPrograms;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            copy[i] = arr[i];
        }
        System.out.println("copied array: ");
        for(int i = 0; i < n; i++){
           System.out.print(copy[i] + " ");
        }

    }
}
