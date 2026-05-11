package demo;

public class MaxSumOfArray {

    public static int solve(int[] nums){

        int sum=0, max=Integer.MIN_VALUE;

        int start=0, arrStart=0, arrEnd=0;

        for(int i=0;i<nums.length;i++){

            if(sum==0){
                start=i;
            }

            sum+=nums[i];

            if(sum>max){
                max=sum;
                arrStart=start;
                arrEnd=i;
            }

            if(sum<0){
                sum=0;
            }

        }

        System.out.print("The subarray is: [");
        for (int i = arrStart; i <= arrEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

    return max;
    }


    static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] arr1=  {5,4,-1,7,8};
        int ans=solve(arr1);
        System.out.println(ans);
    }
}
