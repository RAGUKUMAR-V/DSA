package demo;

import java.util.Arrays;
import java.util.*;

public class ThreeSumProblem {

    public static List<List<Integer>> solve(List<Integer> nums){

        List<List<Integer>>list=new ArrayList<>();

        Collections.sort(nums);

        for(int i=0;i<nums.size()-2;i++){

            if(i>0 && nums.get(i)==nums.get(i-1)){

                continue;
            }

            int left=i+1;
            int right=nums.size()-1;

            while(left<right){

               int sum= nums.get(i)+nums.get(left)+nums.get(right);

               if(sum==0) {
                   list.add(Arrays.asList( nums.get(i),
                           nums.get(left),
                           nums.get(right)));

                   while (left < right && nums.get(left) == nums.get(left + 1)) {
                       left++;
                   }

                   while (left < right && nums.get(right) == nums.get(right - 1)) {
                       right--;
                   }

                   left++;
                   right--;

               }
               else if(sum<0){
                   left++;
               }else{
                   right--;
               }
            }

        }

        return list;
    }

    public static void main(String[] args) {

       List nums=new ArrayList<>(Arrays.asList(-1,0,1,2,-1,-4));
        List<List<Integer>>anss=solve(nums);
        for(List<Integer>ans:anss){
            System.out.println(ans);
        }

    }

}
