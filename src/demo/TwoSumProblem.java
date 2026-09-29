package demo;
import java.util.*;

public class TwoSumProblem {


    public static int[] solve(int[] nums, int target){

        Map<Integer,Integer>map=new HashMap<>();
        int[] ans=new int[2];


        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            int remain=target-nums[i];

            if(map.containsKey(remain)){
                ans[0]=map.get(remain);
                ans[1]=i;

            }
            map.put(nums[i],i);
        }

        return ans;

    }


    public static void solve2(int[] arr, int target) {

        Set<Integer> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);

                result.add(a + "," + b);
            }

            seen.add(num);
        }

        System.out.println(result);
    }



    public static void main(String[] args) {
        int[] nums={1, 5, 4, 3, 9, 8, 3, 2, 8};
        int target=10;
        int[] ans=solve(nums,target);
        solve2(nums,target);
        System.out.println(Arrays.toString(ans));
    }


}
