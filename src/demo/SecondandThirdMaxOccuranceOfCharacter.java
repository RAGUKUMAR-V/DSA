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

       list.sort((a, b) -> b.getValue() - a.getValue());

        // 2nd and 3rd most repeating characters
        char second = list.get(1).getKey();
        char third = list.get(2).getKey();

        System.out.println(second + "," + third);


    }

    public static void solve2(String s){

        String proc = s.toLowerCase().replace(" ", "");

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : proc.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if (map.size() < 3) {
            System.out.println("Not Applicable");
            return;
        }

        Character firstChar = null;
        Character secondChar = null;
        Character thirdChar = null;

        int firstFreq = Integer.MIN_VALUE;
        int secondFreq = Integer.MIN_VALUE;
        int thirdFreq = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            char currentChar = entry.getKey();
            int currentFreq = entry.getValue();

            if (currentFreq > firstFreq) {

                thirdFreq = secondFreq;
                thirdChar = secondChar;

                secondFreq = firstFreq;
                secondChar = firstChar;

                firstFreq = currentFreq;
                firstChar = currentChar;

            } else if (currentFreq > secondFreq) {

                thirdFreq = secondFreq;
                thirdChar = secondChar;

                secondFreq = currentFreq;
                secondChar = currentChar;

            } else if (currentFreq > thirdFreq) {

                thirdFreq = currentFreq;
                thirdChar = currentChar;
            }
        }

        System.out.println(secondChar + "," + thirdChar);

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

         String s="aabbcc";
         solve2(s);


    }

}
