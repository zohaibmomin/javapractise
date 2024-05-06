public class IsSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to Program to check if sorted");
        int[] arr = {1,2,3,4,5,6,7,8};
        boolean isIncreasing = isIncreasing(arr);
        System.out.println("isIncreasing = " + isIncreasing);

        int[] arr2 = {9,8,7,6,5,4,3,2,999};
        boolean isDecreasing = isDecreasing(arr2);
        System.out.println("isDecreasing = " + isDecreasing);
    }

    private static boolean isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }
    private static boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;

    }
}
