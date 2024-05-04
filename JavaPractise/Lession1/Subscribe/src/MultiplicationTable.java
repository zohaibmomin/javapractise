import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the table you want : ");
        int num = input.nextInt();
        printTable(num);
    }

    public static void greet(){
        System.out.println("Welcome to Zohaib Coding");
    }
    public static void printTable( int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + num*i);
        }
    }

}
