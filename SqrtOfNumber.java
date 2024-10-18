package org.JavaArrayPrograms;

public class SqrtOfNumber {
    public static void main(String[] args) {

        //With Method
        int number=25;
        Double Sqrt = Math.sqrt(number);
        System.out.println(Sqrt);

        //Without method
        double high =number,low=0, mid=0, precision =0.00001;
        while((high-low)>precision){
            mid=(low+high)/2;
            if(mid * mid>number){
                high=mid;
            }
            else {
                high=mid;
            }
        }
        System.out.println(mid);

    }
}
