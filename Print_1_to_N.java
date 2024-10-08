package org.JavaArrayPrograms;

import java.util.Scanner;

public class Print_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
