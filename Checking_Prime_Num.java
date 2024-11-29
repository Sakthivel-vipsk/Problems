package org.JavaArrayPrograms;

public class Checking_Prime_Num {
    public static void main(String[] args) {
        int n=23;
        boolean isPrime=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}
