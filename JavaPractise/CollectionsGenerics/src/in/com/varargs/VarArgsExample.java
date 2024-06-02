package in.com.varargs;

public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,5,6,7,7,8));
        System.out.println(sum());
    }
    
    public static int sum(int... list){
        int sum = 0;
        for (int i : list) {
            sum = sum + i;
        }
        return sum;
    }
}