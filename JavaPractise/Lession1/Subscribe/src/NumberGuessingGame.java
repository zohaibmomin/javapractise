import java.util.Random;
import java.util.Scanner;

//Write a program using do-while for guessing the number from user
class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        Random rand = new Random();
        int attempts = 0;
        do {
            System.out.print("Enter the number between 1 to 10 :");
            num = input.nextInt();
            attempts++;

        }while (num != (rand.nextInt(10)+1));
        System.out.println("Match Found with attempts " + attempts);

    }
}
