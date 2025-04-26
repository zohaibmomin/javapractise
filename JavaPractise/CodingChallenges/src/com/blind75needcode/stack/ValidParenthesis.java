package com.blind75needcode.stack;

/* Problem
Given a string s containing only '(', ')', '{', '}', '[' and ']', check if the input string is valid:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.*/

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println("Hi, Program starts");
        String s = "{[(()]}";

        System.out.println("isValid -> " + isValid(s));

    }

    /*Algo -
    - create a map of close bracker : open bracket
    - push in stack all opening brackets and pop all matching closing brackets
    */
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');//round matching brackets
        map.put(']', '[');//square closing brackets
        map.put('}', '{');//curly closing brackets

        //Now iterate over string making it into Array of characters


        for (int i = 0; i < s.length(); i++) {
            char myChar = s.charAt(i);

            if (map.containsKey(myChar)) {
                // If it's an closing bracket → Check if stack is not empty and top matches.
                // If yes, pop it
                //Otherwise, invalid immediately.
                if (!stack.isEmpty() && map.get(myChar) == stack.peek()) {
                    //if stack is not empty and the latest element is matching with map
                    // means closing bracket matching is found in map
                    // then remove the closing bracket
                    stack.pop();
                } else {
                    // means the latest closing bracket on stack does not have a opening bracket
                    return false;
                }
            } else {
                // If it's an opening bracket → push to stack.
                stack.push(myChar);
            }

        }

        return stack.isEmpty(); //means if all closing brackets are popped which means all matches found in map having opening brackets
    }
}
