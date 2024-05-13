import java.util.Scanner;

public class PalindromeDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.next();

        PalindromeDetector pd = new PalindromeDetector();
//        pd.isPalindromeIteration(str);
        System.out.println("Your string is : " +
                (pd.isPalindromeRecursive(str) ? "Palindrome" : "NOT a Palindrome"));

    }

    private boolean isPalindromeRecursive(String str) {
        //base case
        //if single character then return true
        if(str.length() <=1){
            return true;
        }
        //check if first charactor is same as last
        int lastPos = str.length()-1;
        if(str.charAt(0) != str.charAt(lastPos)) {
            return false;

        }

        //take substring
        String newStr = str.substring(1,lastPos);
        return isPalindromeRecursive(newStr);
    }

    private void isPalindromeIteration(String str) {
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char c =  str.charAt(i);
            char c1 = str.charAt(str.length() - (i+1));
//            System.out.println("c :" + c);
//            System.out.println("c1 :" + c1);
            if(c != c1){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Result is : " + (isPalindrome ? "True" : "False"));
    }
}
