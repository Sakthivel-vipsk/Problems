package org.JavaArrayPrograms;

public class ReverseANumber_Palindrome {
    public static void main(String[] args) {
        int n=131;
        int temp =n;
        int reverse=0;
        while(n>0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        System.out.println(reverse);
        if(reverse==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
