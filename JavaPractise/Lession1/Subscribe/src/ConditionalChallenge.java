import java.util.Scanner;

public class ConditionalChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Detect number is positive or negative
        System.out.println("Please enter number");
        int number = input.nextInt();
        if(number>0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }

        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println(++number);

    }
}
