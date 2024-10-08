package org.JavaArrayPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Long factorial = 1L;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("factorial of " + n + "! is : " + factorial);
    }
}
