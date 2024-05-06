import java.util.Arrays;

//Logic
//Loop both arrays until both are empty
// if ele of arr1 is smaller than ele of arr2 then push ele of arr1 to finalArr
//else ele of arr2 goes to finalArr
//Break condition - check if arr1 is looped till length and if arr2 is looped till length
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to MergeTwo Sorted Array");
        int[] arr = {1,3,5,7};
        int[] arr2 = {2,4,6,8,10,12,14};

        int finalLength = arr.length + arr2.length;
        int[] finalArr = new int[finalLength];

        int i=0,j=0,k=0;
        while(i <arr.length || j <arr2.length){
            if(j == arr2.length ||
                    ( i < arr.length && arr[i] < arr2[j])){
                finalArr[k] = arr[i];
                i++;
                k++;
            }else {
                finalArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        System.out.println(Arrays.toString(finalArr));


    }
}
