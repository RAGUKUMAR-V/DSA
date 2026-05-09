package demo;

import java.util.*;


public class SecondandThirdMaxOccuranceOfCharacter {

    public static void solve(String s){

        String proc=s.toLowerCase().replace(" ","");

        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();

        for(char ch:proc.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        // If fewer than 3 distinct characters
        if (map.size() < 3) {
            System.out.println("Not Applicable");
            return;
        }

        // Convert map entries to list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());

        /*
         Sort by:
         1. Higher frequency first
         2. If same frequency, preserve insertion order
            (LinkedHashMap already keeps first appearance order)
        */
        list.sort((a, b) -> b.getValue() - a.getValue());

        // 2nd and 3rd most repeating characters
        char second = list.get(1).getKey();
        char third = list.get(2).getKey();

        System.out.println(second + "," + third);


    }


    public static void main(String[] args) {

//        Problem Statement
//        You are given a string consisting of lowercase and uppercase letters, digits, spaces, and special characters.
//
//        Your task is to:
//        Count the frequency of each character in the string (ignore spaces).
//
//                Print:
//        The 2nd most repeating character
//        The 3rd most repeating character
//
//        Rules:
//        Comparison should be case-insensitive (treat A and a as same).
//                Ignore spaces while counting.
//                If multiple characters have the same frequency, choose the one that appears first in the string.
//        If fewer than 3 distinct characters exist, print "Not Applicable".
//
//                Sample Inputs and Outputs
//        Example 1
//        Input:
//        hello how are you
//        Processed: hellohowareyou
//        Frequencies:
//        o → 3
//        h → 2
//        e → 2
//        l → 2
//        w → 1
//        a → 1
//        r → 1
//        y → 1
//        u → 1
//
//        Output:h,e
//
//        Example 2
//        Input: banana bread
//        Processed: bananabread
//        Output:n,b
//
//        Example 3
//        Input: Mississippi River
//        Processed: mississippiriver
//        Output:s, r
//
//        Input: aaaa
//        Output: Not Applicable
//*********************************/

         String s="banana bread";
         solve(s);


    }

}
