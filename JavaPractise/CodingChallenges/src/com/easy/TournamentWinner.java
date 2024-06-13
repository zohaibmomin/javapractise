package com.easy;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Problem - https://www.algoexpert.io/questions/tournament-winner
public class TournamentWinner {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competition = new ArrayList<ArrayList<String>>();

        ArrayList<String> singleList = new ArrayList<String>();
        singleList.add("HTML");
        singleList.add("C#");
        competition.add(singleList);

        ArrayList<String> singleList1 = new ArrayList<String>();
        singleList1.add("C#");
        singleList1.add("Python");
        competition.add(singleList1);

        ArrayList<String> singleList2 = new ArrayList<String>();
        singleList2.add("Python");
        singleList2.add("HTML");
        competition.add(singleList2);

        competition.stream().forEach(System.out::println);

        ArrayList<Integer> results = new ArrayList<Integer>();
        results.add(0);
        results.add(0);
        results.add(1);

        results.stream().forEach(result-> System.out.printf(" %s",result));
        String result = tournamentWinner(competition, results);
        System.out.printf("Final Winner %s",result);

    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String,Integer> matchWinners = new HashMap<>();

        for (int i = 0; i < results.size(); i++) {
            int result = results.get(i);
            ArrayList<String> match = competitions.get(i);
            String winner;

            if(result == 0){
                winner = match.get(1);
            }else{
                winner = match.get(0);
            }

            if(matchWinners.containsKey(winner)){
                //if same winner then add 3 points
                int points = matchWinners.get(winner) + 3;
                matchWinners.put(winner,points);
            }else{
                //if first time in map then set 3
                matchWinners.put(winner,3);
            }
        }

        Optional<Map.Entry<String, Integer>> finalWinner = matchWinners.entrySet().stream().max((num1, num2) -> num1.getValue() - num2.getValue());

        System.out.printf("\nList of Winners %s \n",matchWinners.toString());

        return finalWinner.get().getKey();
    }
}

