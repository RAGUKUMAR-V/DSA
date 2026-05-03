package demo;

public class FindSecondLargest {


    public static int solve(int[] arr){

        int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secMax=max;
                max=arr[i];
            } else if (arr[i]>secMax && arr[i]!=max) {
                secMax=arr[i];
            }
        }
        return secMax;

    }

    static void main(String[] args) {

        int[] arr={1,2,2,3,4,-5,5,-6,3};
       int ans= solve(arr);
       System.out.println(ans);
    }
}
