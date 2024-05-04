import java.util.Scanner;

public class BitWiseDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Bitwise demo");
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Bitwise & ");
        System.out.println(num1 & num2);
        System.out.println("Bitwise OR ");
        System.out.println(num1 | num2);
        System.out.println("Bitwise XOR ");
        System.out.println(num1 ^ num2);
        System.out.println("Bitwise NOT ");
        System.out.println(~num2);
        System.out.println("Bitwise << ");
        System.out.println(num2 << 2);
        System.out.println("Bitwise >> ");
        System.out.println(num2 >> 1);

        System.out.println("odd or even ");
        //even numbers have right most bit as 0
        // by using & bitwise with 1 other bits we get 0 or 1
        if((num1 & 1) == 1){
            System.out.println(num1 + " is odd");
        }else {
            System.out.println(num1 + " is even");
        }




    }
}
