package com.medium;

import java.util.Arrays;

public class productsArray {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2};
        int[] answer = arrayOfProducts(array);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] arrayOfProducts(int[] array) {
        int[]result = new int[array.length];

        for(int i=0;i<array.length;i++){
            int product =1;
            for(int j=0;j<array.length;j++){
                if(i==j)continue;
                product = product * array[j];
            }
            result[i]=product;
        }

        return result;
    }
}
