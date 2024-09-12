package com.easy;


import java.util.ArrayList;
import java.util.List;

//https://www.algoexpert.io/questions/product-sum
public class Productsum {
    public static void main(String[] args) {
//        List<Object> array = [5, 2, [7, -1], 3, [6, [-13, 8], 4]];

    }

    public static int productSum(List<Object> array) {
        return publicSumHelper(array, 1);
    }

    public static int publicSumHelper(List<Object> array, int depth) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof ArrayList) {
                sum += publicSumHelper((List<Object>) element, depth++);
            } else {
                sum += (int) element;
            }
        }
        return sum * depth;
    }
}
