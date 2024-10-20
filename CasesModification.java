package org.JavaArrayPrograms;

import java.util.Scanner;



public class CasesModification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to modify: ");
        String str = sc.nextLine();
        String alteredString = converting(str);
        System.out.println(alteredString);
    }

    private static String converting(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
           else if(Character.isLowerCase(c)) {
               sb.append(Character.toUpperCase(c));
            }
           else {
               sb.append(c);
            }
        }
        return sb.toString();
    }
}
