package demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroToEnd {

    public static int[] solve(int[] nums){

        int j=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=0){

                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }


        }
         return nums;

    }



    public static void main(String[] args) {
        int[] nums={1,1,1,1,0,1,0,3,12};
       int[] anss= solve(nums);
       System.out.println(Arrays.toString(anss));


    }


}
