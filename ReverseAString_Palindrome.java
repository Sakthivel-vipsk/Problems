package org.JavaArrayPrograms;

public class ReverseAString_Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
        if(str.equals(reversedStr)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

}
