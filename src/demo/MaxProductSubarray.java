package demo;

public class MaxProductSubarray {

    public static int solve (int[] nums){

        int max = nums[0];
        int min = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            answer = Math.max(answer, max);
        }

        return answer;

    }


    public static void main(String[] args) {


        int[] nums={2,4,3,-9,9};
        int ans=solve(nums);
        System.out.println(ans);

    }
}
