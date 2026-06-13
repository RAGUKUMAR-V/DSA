package demo;

import java.util.*;

public class ProductArrayExceptSelf {

    public static List<Integer> solve(int[] nums){

        List<Integer>list=new ArrayList<>();

        int product=1;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                }

            }
            list.add(product);
            product=1;
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,4};
        List<Integer>ans=solve(nums);
        System.out.println(ans);


    }

}
