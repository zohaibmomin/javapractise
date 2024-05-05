import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong no. Find if Armstrong for a given number n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = input.nextInt();
        boolean result = isArmstrong(num);
        System.out.println("isArmstrong of " + num + " is = "+ result);
    }

    private static boolean isArmstrong(int num) {
        int numLength = (int) (num + "").length();
        int originalNum = num;
        int finalNum = 0;
        while (num > 0){
            int digit = num % 10;
            num = num/10;
            finalNum = (int) (finalNum + Math.pow(digit,numLength));
        }
        return finalNum == originalNum;
    }
}
