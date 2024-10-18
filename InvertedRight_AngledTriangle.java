package org.JavaArrayPrograms;

public class InvertedRight_AngledTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        *****
//        ****
//        ***
//        **
//        *
