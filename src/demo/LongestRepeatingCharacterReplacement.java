package demo;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {

    public static int solve(String s,int k){

        int[] freq=new int[26];

        int maxfre=0;
        int left=0;
        int maxlength=0;

        for(int right=-0;right<s.length();right++){

            char current=s.charAt(right);
            freq[current-'A']++;
            maxfre=Math.max(maxfre,freq[current-'A']);

            while(((right-left+1)-maxfre)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxlength=Math.max(maxlength,(right-left+1));

        }
        System.out.println(Arrays.toString(freq));
        return maxlength;

    }

    public static void main(String[] args) {
        String s="ABAB";

         System.out.println(solve(s,2));
    }


}
