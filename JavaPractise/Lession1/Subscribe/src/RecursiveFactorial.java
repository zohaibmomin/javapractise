import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Page \n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the no : ");
        int num = input.nextInt();

        RecursiveFactorial rcf = new RecursiveFactorial();
//        int fact = rcf.factorialRecursive(num);
//        System.out.println("Factorial is : " + fact);


        rcf.printFiboSeries(num);
        rcf.printFiboNth(num);

    }

    private void printFiboNth(int num) {
       int fiboVal =  this.fibo(num);
       System.out.println("\n Fibonacci value for n = " + num + " is := " + fiboVal);
    }

    private void printFiboSeries(int num) {
        System.out.println("Fibonacci series upto num " + num);
        for (int i = 0; i <= num; i++) {
            int fibo = this.fibo(i);
            System.out.print(fibo + " ");
        }
    }

    private int fibo(int n) {
       if(n == 0)return 0;
       if(n ==1)return 1;

       return fibo(n - 1) + fibo(n - 2);
    }

    private int factorialRecursive(int num) {
        if(num < 0 || num == 1 || num == 0) {
            return 1;
        }

        return num * factorialRecursive(num - 1);
    }


}
