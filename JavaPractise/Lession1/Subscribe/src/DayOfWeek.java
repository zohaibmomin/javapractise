import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Wecome to switch control");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 7 : ");
        int day = input.nextInt();

        boolean isValid = day >= 1 && day <= 7;

        if(isValid){
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
//                default:
//                    System.out.println("Extra");

            }
        }else{
            System.out.println("Invalid day");
        }
    }
}
