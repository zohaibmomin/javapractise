import java.util.Arrays;

//Logic- Swap first with last. Loop till half of array
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to ReverseArray");
//        int[] arr= {1,2,3,88,9,5,3,8,7,3,5,1,2,3,-199,200,2,198,-1,5};
        int[] arr={1,2,3,4,5,4,3,2,1};
        boolean isPalindrom = true;
        for (int i = 0; i < arr.length/2; i++) {
            int tail = arr.length-(i+1);
            if(arr[i] != arr[tail]){
                isPalindrom = false;

            }
//            if(i<tail){
                int temp = arr[tail];
                arr[tail] = arr[i];
                arr[i] = temp;
//            }
        }
        System.out.println("Reversed Array is " + Arrays.toString(arr));
        System.out.println("isPalindrome is " + isPalindrom);
    }
}
