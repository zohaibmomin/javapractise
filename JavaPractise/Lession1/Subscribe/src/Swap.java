import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number : ");
        int num2 = input.nextInt();
        System.out.println("Before number1 is " + num1 + " number 2 is " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping number1 is " + num1 + " number 2 is " + num2);
    }
}
