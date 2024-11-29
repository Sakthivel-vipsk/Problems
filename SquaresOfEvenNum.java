package org.JavaArrayPrograms;

import java.util.Arrays;
import java.util.List;

public class SquaresOfEvenNum {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Numberrs are : " + numbers);
        List<Integer> sqaureNum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println(" Square of Even numbers : " + sqaureNum);

    }
}
