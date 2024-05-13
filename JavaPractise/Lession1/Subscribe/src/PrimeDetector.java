import java.util.Scanner;

public class PrimeDetector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number :");
        int num = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                System.out.println("Divided by : " + i);
                isPrime = false;
                break;
            }
        }

        System.out.println("Your number is : " + (isPrime ? "Prime" : "Not a prime"));
    }
}
