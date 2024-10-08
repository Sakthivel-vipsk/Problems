package org.JavaArrayPrograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int reversed = 0;
        while(n != 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversed number is :"+ reversed);
        sc.close();
    }
}
