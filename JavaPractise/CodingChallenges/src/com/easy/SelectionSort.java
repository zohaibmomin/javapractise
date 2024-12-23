package com.easy;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        System.out.println(Arrays.toString(selectSort(array)));
    }

    private static int[] selectSort(int[] array) {
        if(array.length==0) return new int[]{};
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
        return array;
    }
}
