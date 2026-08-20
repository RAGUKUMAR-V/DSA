package demo;

public class FindSecondLargest {


    public static int solve(int[] arr){

        int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i]>secMax && arr[i]!=max) {
                secMax=arr[i];
            }
        }
        return secMax;

    }

    public static int solve2(int[] arr){

        int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE,
                thirdMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                thirdMax=secMax;
                secMax=max;
                max=arr[i];
            } else if (arr[i]>secMax && arr[i]!=max ) {
                thirdMax=secMax;
                secMax=arr[i];
            }else if(arr[i]>thirdMax && arr[i]!=secMax){
                thirdMax=arr[i];
            }
        }
        return max;

    }

    static void main(String[] args) {

        int[] arr={-1,-2,-3,0};
       int ans= solve2(arr);
       System.out.println(ans);


    }
}
