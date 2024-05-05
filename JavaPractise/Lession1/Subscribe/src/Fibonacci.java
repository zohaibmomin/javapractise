import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci. Find a fibo upto a number n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = input.nextInt();
        printFibo(num);
    }

    public static void printFibo(int num){
        if(num < 0)return;
        System.out.print("0 ");
        if(num ==0 )return;
        System.out.print("1 ");


        int first = 0, second = 1;

        int sum=0;
        while (sum <= num){
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}
