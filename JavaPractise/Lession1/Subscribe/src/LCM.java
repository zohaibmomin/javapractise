import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM & GCD. Find a LCM & GCD for a given numbers n1 & n2");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number 1 - ");
        int num1 = input.nextInt();

        System.out.print("Enter the number 2 - ");
        int num2 = input.nextInt();

        int result = calculateLCM(num1,num2);
        System.out.println("LCM is = "+ result);

        int result2 = calculateGCD(num1,num2);

        System.out.println("GCD is = "+ result2);
    }

    private static int calculateLCM(int num1, int num2) {
        int product=1;
        int count=1;
        while(true){
            product = num1*count;
            if(product % num2 ==0){
                break;
            }
            count++;
        }
        return product;

    }

    private static int calculateGCD(int num1, int num2) {
        int count=2;
        int min=0;
        int gcd = 1;
        if (num1<num2){
            min = num1;
        }else{
            min = num2;
        }
        while(count <= min){
            if(num1 % count == 0 && num2 % count == 0){
                gcd=count;
            }
            count++;
        }
        return gcd;

    }

}
