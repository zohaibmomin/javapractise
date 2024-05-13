
import java.util.Objects;
import java.util.Scanner;

public class OccurencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{
                88,55,66,-1,99,-1,3,4,5,-1,66
        };
        System.out.println("Enter the no you want to search : ");
        int num = input.nextInt();
        int count=0;
        for(int element : arr){
            if(num == element){
                ++count;
            }

        }
        System.out.println("No of occurences is : " + count);

        OccurencesForEach obj = new OccurencesForEach();
                obj.breakExit(input);

    }

    private void breakExit(Scanner input) {
        while(true){
            System.out.println("Enter your command");
            if (input.next().equals("exit")){
                break;
            }
        }
        System.out.println("You entered exit");
    }
}
