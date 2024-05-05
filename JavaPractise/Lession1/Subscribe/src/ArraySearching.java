import java.util.Arrays;
import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("Welcome to ArraySearching. Search a given number from array n");
        Scanner input = new Scanner(System.in);

        int[] arr = {2,34,56,63,98,55,767,88,34,99,23};
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the number to search : - ");
        int num = input.nextInt();



        int indexPos = searchArr(arr,num);
        if(indexPos > 0){
            System.out.println("Found at " + (++indexPos));
        }else {
            System.out.println("Not found");
        }

    }

    private static int searchArr(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
