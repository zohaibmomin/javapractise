import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial. Find a factorial for a given number n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = input.nextInt();
        long result = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is = "+ result);


    }
    public static long calculateFactorial(int num){
        if (num < 2){
            return 1;
        }
        int count =1;
        long fact=1;
        while (count <= num){
            fact = fact * count;
            count++;
        }
        return fact;

    }
}
