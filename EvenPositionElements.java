package org.JavaArrayPrograms;

import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(" Displaying the elements of the array in even index");
        for(int i =1;i<n;i+=2){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n Displaying the elements of the array in odd index");
        for(int i =0;i<n;i+=2){
            System.out.print(arr[i]+ " ");
        }
    }
}
