package org.JavaArrayPrograms;

import java.util.Scanner;

public class StringRotation {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string1: ");
    String st1 = sc.nextLine();
    System.out.println("Enter a string2: ");
    String st2 = sc.nextLine();
    String con = st1 +st2;

    if(st1.length() != st2.length()){
        System.out.println("Not Matching length--> So not..");
        System.out.println(st2 + " is not a rotation of " + st1);
    }
    else{
        System.out.println("concantination : " + con);
        con.contains(st2);
        System.out.println(st2 + " is a rotation of " + st1);
    }
}
}
