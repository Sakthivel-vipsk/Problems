package org.JavaArrayPrograms;

public class SwapTwoNumbers {
    public static void main(String [] args){
        int a =10, b=20;
        System.out.println("Before Swap : a =  "+a +",b= "+b);
        int temp = a;
        a=b;
        b=a;
        System.out.println("After Swap : a =  "+a +",b= "+b);
    }
}
