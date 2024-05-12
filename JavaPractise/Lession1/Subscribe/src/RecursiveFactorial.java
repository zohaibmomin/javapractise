import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Page \n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the no : ");
        int num = input.nextInt();

        RecursiveFactorial rcf = new RecursiveFactorial();
        int fact = rcf.factorialRecursive(num);
        System.out.println("Factorial is : " + fact);
    }

    private int factorialRecursive(int num) {
        if(num < 0 || num == 1 || num == 0) {
            return 1;
        }

        return num * factorialRecursive(num - 1);
    }
}
