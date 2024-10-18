package org.JavaArrayPrograms;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,6,32,7,8,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //using inbuilt method
        System.out.println("Element found at index " + binarySearch(arr, 3));
        int target = 8;

        int index= binarysearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }

    }

    private static int binarysearch(int[] arr, int target) {
        int left =0;
        int right =arr.length-1;
        while (left<=right){
            int mid = left+ (right- left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }
}
