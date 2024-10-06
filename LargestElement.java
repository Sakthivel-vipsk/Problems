package org.JavaArrayPrograms;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);

        int smallest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
