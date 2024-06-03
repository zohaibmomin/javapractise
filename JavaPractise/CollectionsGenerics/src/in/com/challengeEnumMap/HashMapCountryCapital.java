package in.com.challengeEnumMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCountryCapital {
    public static void main(String[] args) {
        HashMap<String,String> countryMap = new HashMap<>();
        countryMap.put("India","Delhi");
        countryMap.put("Pakistan","Karachi");
        countryMap.put("Japan","Tokyo");
        countryMap.put("USA","Washington DC");
        countryMap.put("Russia","Moscow");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a country from below list :");
        for (String country : countryMap.keySet()) {
            System.out.println(country);
        }
        System.out.println();
        String countryName = input.next();
        if(countryMap.containsKey(countryName)){
            System.out.printf("Country :: %s -- Capital :: %s ",countryName,countryMap.get(countryName));
        }else{
            System.out.println("Sorry! We do not have this country");
        }
    }
}
