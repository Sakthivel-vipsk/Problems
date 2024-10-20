package org.JavaArrayPrograms;

public class RemoveSpacesinAString {
    public static void main(String[] args) {
        String str = "     This is a string";
        String altersString= str.replaceAll(" ", "");
        System.out.println(altersString);
    }
}
