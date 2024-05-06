import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average problem");
        int[] arr = {1,2,3,88,9,5,3,8,7,3,5,1,2,3};
        printSumAvg(arr);
        printOccurences(arr);
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
