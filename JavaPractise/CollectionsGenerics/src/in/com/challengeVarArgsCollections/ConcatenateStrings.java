package in.com.challengeVarArgsCollections;

import java.util.Arrays;

public class ConcatenateStrings {
    public static void main(String[] args) {
        System.out.println(concatenate("My"));
        System.out.println(concatenate("My","Name"));
        System.out.println(concatenate("My","Name","is"));
        System.out.println(concatenate("My","Name","is","Zohaib"));
    }
    public static String concatenate(String... strings){
//        String str = "";
//        for (String string : strings) {
//            str = str + string;
//        }
        StringBuilder str = new StringBuilder();
        for (String string : strings) {
            str.append(string);
        }
            return str.toString();
    }

}
