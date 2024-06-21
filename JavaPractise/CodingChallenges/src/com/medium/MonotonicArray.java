package com.medium;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
//        int[] array = {1, 2, 3, 3, 2, 1};
        System.out.println(isMonotonic(array));


    }
    public static boolean isMonotonic(int[] array) {
        boolean increasing=true;
        boolean decreasing=true;

        for(int i=0;i<array.length-1;i++){
            if(array[i] < array[i+1]){
                decreasing = false;
            }else if(array[i] > array[i+1]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
