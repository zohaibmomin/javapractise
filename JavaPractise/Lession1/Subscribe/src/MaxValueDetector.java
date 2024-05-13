import java.util.Scanner;

public class MaxValueDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{
                88,55,66,44,99,2,3,4,5,-1,6
        };
        int max = Integer.MIN_VALUE;
        //logic is take minimum value and compare each value from array with this
        for(int elem : arr){
            if(max < elem){
                max = elem;

            }
        }
        System.out.println("Maximum number is :" + max);
    }
}
