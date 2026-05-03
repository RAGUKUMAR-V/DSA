package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfSubarraysPresentForGivenSum {


    public static int solve(List<Integer> nums, int target){

        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<nums.size();i++ ){
            int sum=0;
            for(int j=i;j<nums.size();j++){
                sum=sum+nums.get(j);
                if(target==sum){
                    List<Integer> sums=nums.subList(i,j+1);
                    if(sums.size()>1){
                        ans.add(sums);
                    }
                }
            }
        }

        return ans.size();

    }


    static void main(String[] args) {

        List<Integer>list= Arrays.asList(1, 2, 3, 0, 1, 0, 0, -3, 2, 1);
       int ans=solve(list,0);

       //System.out.println(Arrays.toString(ans.toArray()));
        System.out.println(ans);



    }
}
