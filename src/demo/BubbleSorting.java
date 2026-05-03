package demo;

import java.util.Arrays;

public class BubbleSorting {

    public static int[] solve(int[] nums){

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        return nums;

    }


    static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] ans=solve(arr);
        System.out.println(Arrays.toString(ans));
    }
}
