package demo;

import java.util.Arrays;

public class StringCompression {

    public static int solve(char[] nums){

        int read=0;
        int write=0;

        while(read<nums.length){

            char currentchar=nums[read];

            int count=0;

            while(read<nums.length && nums[read]==currentchar){

                read++;
                count++;

            }

            nums[write]=currentchar;
            write++;

            if(count>1){
                String charstr=String.valueOf(count);
                for(char num:charstr.toCharArray()){
                    nums[write]=num;
                    write++;
                }
            }

        }
        System.out.println(Arrays.toString(nums));

        return write;

    }

    public static void main(String[] args) {

        char[] chars ={'a','a','b','b','c','c','a'};
        char[] chars1 ={'a','b','a'};

        System.out.println(solve(chars));
    }
}
