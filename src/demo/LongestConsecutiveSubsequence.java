package demo;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

    public static int solve(int[] nums){

        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int maxLen=0;
        for(int c:set){
            if(!set.contains(c-1)) {
                int curr = c;
                int len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLen=Math.max(len, maxLen);
            }


        }

        return maxLen;

    }

    static void main(String[] args) {

        int[] nums={100, 4, 200, 1, 3, 2};

       int ans= solve(nums);
       System.out.println(ans);

    }
}
