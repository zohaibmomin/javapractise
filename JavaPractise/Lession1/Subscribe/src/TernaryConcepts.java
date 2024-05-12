import java.util.Scanner;

public class TernaryConcepts {
    public static void main(String[] args) {
        System.out.println("Welcome to ternary");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = input.nextInt();

        TernaryConcepts tc = new TernaryConcepts();
        int greaterNum = tc.findMax(num1,num2);
        System.out.println("Greatest is -> " + greaterNum);

        String oddEven = tc.findOddEven(num1);
        System.out.println("Number 1 is -> " + oddEven);

        String oddEven2 = tc.findOddEven(num2);
        System.out.println("Number 2 is -> " + oddEven2);

        int abs1 = tc.findAbsolute(num1);
        System.out.println("Abs of num1 is : " + abs1);

        int abs2 = tc.findAbsolute(num2);
        System.out.println("Abs of num2 is : " + abs2);

        String marks1 = tc.findHighLowMedium(num1);
        System.out.println("Marks 1 is -> " + marks1);

        String marks2 = tc.findHighLowMedium(num2);
        System.out.println("Marks 2 is -> " + marks2);

        String month1 = tc.findMonth(num1);
        System.out.println("Month of num1 is : " + month1);

        String month2 = tc.findMonth(num2);
        System.out.println("Month of num2 is : " + month2);



        double calc = tc.calculate(input,num1,num2);
        System.out.println("Result is : "+ calc);


    }

    private double calculate(Scanner input,int num1, int num2) {
        System.out.println("Enter the Operation you want to do? : Add/Sub/Mul/Div : ");
        String operation = input.next();//not nextLine
        return switch (operation){
            case "Add" -> num1+num2;
            case "Sub" -> num1-num2;
            case "Mul" -> num1*num2;
            case "Div" -> num1/num2;
            default -> -1;
        };
    }

    private String findMonth(int num1) {
        return switch (num1){
          case 1 -> "Jan";
          case 2 -> "Feb";
          case 3 -> "March";
          case 4 -> "April";
          case 5 -> "May";
          case 6 -> "June";
          case 7 -> "July";
          case 8 -> "Aug";
          case 9 -> "Sept";
          case 10 -> "Oct";
          case 11-> "Nov";
          case 12-> "Dec";
          default ->"Invalid Month";
        };
    }

    private String findHighLowMedium(int num1) {
        return num1 > 80 ?  "HIGH" : (num1 < 50 ? "LOW" : "MEDIUM");
    }

    private int findAbsolute(int num2) {
        return num2 < 0 ? num2 * -1 : num2;
    }

    private String findOddEven(int num1) {
        return num1 % 2 == 0 ? "Even" : "Odd";
    }

    public int findMax(int num1,int num2){
        return num1 > num2 ? num1:num2;
    }

}
