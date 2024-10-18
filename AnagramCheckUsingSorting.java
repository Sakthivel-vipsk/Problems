package org.JavaArrayPrograms;

import java.util.Arrays;

public class AnagramCheckUsingSorting {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not the same, So Not a Anagram ");
        }
        else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println(str1 + " and " + str2 + " are the same, So It's Anagram ");
            }
        }
    }

}
