package org.JavaArrayPrograms;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num=153;
        int sum=0;
        int noOfDigits=String.valueOf(num).length();
        int originalNum=num;
        while(num!=0){
            int digit=num%10;
            sum+=Math.pow(digit,noOfDigits);
            num=num/10;
        }
        if(sum==originalNum){
            System.out.println("The Armstrong number is "+originalNum);
        }
        else{
            System.out.println("The Armstrong number is not "+originalNum);
        }
    }
}
