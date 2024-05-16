package com.example.inheritance;

public class NestedClassArrayOps {
    static int[] arr;

    NestedClassArrayOps(int[] arr) {
        NestedClassArrayOps.arr = arr;
    }


    static class Statistics{

        static void mean(){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                    sum +=arr[i];
            }
            System.out.printf("Mean is : %s", sum/ arr.length);
        }

        static void median(){
            int medianPos = (int) arr.length/2;
            System.out.printf("Median is : %s", arr[medianPos]);
        }

        public static void main(String[] args) {
            int[] arr = new int []{1,2,3,4,5,99};
            NestedClassArrayOps arrayOps = new NestedClassArrayOps(arr);
            //non static way of Statistics class
            // NestedClassArrayOps.Statistics st = arrayOps.new Statistics();

            //static way of Statistics class
            mean();
            median();
        }
    }

}
