import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D array example");

        //1st way
        int[][] arr = {
                {
                    28,44,55
                },
                {
                    88,99,222
                }
        };
        System.out.println("Array  is arr[0][0] & arr[1][0]" + arr[0][0] + " & " + arr[1][0]);

        //2nd way
        int[][] myArr = new int[2][3];
        myArr[0][0] = arr[0][0];
        System.out.println("My Array  is arr[0][0] " + arr[0][0]);
        
        //print all array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nRow " + i);
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\nCol " + j + " ");

                System.out.print(arr[i][j] + " ");
            }
            
        }

    }
}
