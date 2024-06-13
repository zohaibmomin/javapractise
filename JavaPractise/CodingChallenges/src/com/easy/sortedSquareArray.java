package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class sortedSquareArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.printf("Sqaures are %s ",sortedSquaredArray(arr).toString());
//        Arrays.stream(arr)
//                .map(num->num*num)
//                .forEach(s-> System.out.printf(" %s",s));
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        for(int i=0;i<array.length;i++){
            array[i]= array[i] * array[i];
        }
        Arrays.sort(array);
        return array;

    }
}
