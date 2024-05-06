import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average problem");
        int[] arr = {1,2,3,88,9,5,3,8,7,3,5,1,2,3,-199,200,2,198,-1,5};
        printSumAvg(arr);
        printOccurences(arr);
        printMax(arr);
    }

    private static void printMax(int[] arr) {
        int max , min;
        max=min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }

    private static void printOccurences(int[] arr) {
        System.out.print("Please enter the number from the arr you want - " + Arrays.toString(arr) + " = ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                count++;
            }
        }
        if(count>0){
            System.out.println("Found No of occurences " + count);
        }else{
            System.out.println("Not found");
        }
    }

    private static void printSumAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum is " + sum + " Average is " + sum/ arr.length);
    }

}
