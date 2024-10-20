package org.JavaArrayPrograms;

public class Reverse_A_String_In_place {
    public static void main(String[] args) {
        String str = "Hello World";
        String reverseString= reverseAString(str);
        System.out.println("Reversed String: " + reverseString);
    }

    private static String reverseAString(String chars) {
        char[] charArr = chars.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
