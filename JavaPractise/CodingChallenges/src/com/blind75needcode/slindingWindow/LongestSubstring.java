package com.blind75needcode.slindingWindow;

import java.util.HashSet;

/*https://neetcode.io/problems/longest-substring-without-duplicates
* Given a string s, find the length of the longest substring without duplicate characters.
A substring is a contiguous sequence of characters within a string.
Example 1:
Input: s = "zxyzxyz".
Output: 3*/
public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println("Starts..https://neetcode.io/problems/longest-substring-without-duplicates");

        //put the characters in a set
        //set will not allow duplicate
        //we have to return the max length of such string
        System.out.println("Output is " + lengthOfLongestSubstring("zxyzxyz"));


    }

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {

            //remove left from set and move left pointer
            // if found duplicate then it means streak is over

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, set.size());
        }
        return maxLength;
    }
}

/*Algorithm explanation
* Basically you keep a window
*
* 1st pass - x
* start x, end x
* window x
* set size 1
*
* 2nd pass - x y
* start x , end y
* window xy
* maxlength 2 bcoz now the set size is 2
*
* 3rd pass - x y z
* start x , end z
* window xyz
* maxLength 3 bcoz set size is 3
*
* 4th pass - x y z x
* start y, end x
* window yzx
* maxlength same as before 3
* Here since x exists in set then you go inside the set and remove the charAt(pos) and move the left pointer
*
* 5th pass -  y z x y
* start z , end y
* window zxy
* maxlength same as before 3
* Here since x exists in set then you go inside the set and remove the charAt(pos) and move the left pointer
*
* 6th pass - z x y z
* start x, end z
* window xyz
* maxlength same as before 3
* * Here since x exists in set then you go inside the set and remove the charAt(pos) and move the left pointer

* 7th pass - xyz
* start x , end n+1
* Terminate
*

 * */