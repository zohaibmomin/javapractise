import java.util.Scanner;

public class SumAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2D Array");
        int [][] arr = get2DArray();
        int sum = sum2DArray(arr);
        double avg = avg2DArray(arr);
        System.out.println("Sum is : " + sum);
        System.out.println("Avg is : " + avg);
    }

    private static double avg2DArray(int[][] arr) {
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length; // assumption is homegenous array
        double deno = rows*cols;
        return sum2DArray(arr)/(deno);
    }

    private static int sum2DArray(int[][] arr) {
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }

        }
        return sum;
    }

    private static int[][] get2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no of rows : ");
        int rows = input.nextInt();
        System.out.print("Please enter no of cols : ");
        int cols = input.nextInt();

        int[][]arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for row : " + i + " col : " + j + " : ");
                arr[i][j] = input.nextInt();

            }
        }
        return arr;

    }
}
