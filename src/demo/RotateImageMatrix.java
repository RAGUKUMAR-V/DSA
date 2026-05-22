package demo;

import java.util.Arrays;

public class RotateImageMatrix {
    //without creating the new array, we have to modify the existing array
    public static int[][] solve(int[][] given){

        int n=given.length;

        // Step 1 : Transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                int temp=given[i][j];
                given[i][j]=given[j][i];
                given[j][i]=temp;
            }
        }


        // Step 2 : Reverse each row
        for(int i=0;i<n;i++){

            int left=0;
            int right=n-1;
            while(left<right){

                int temp=given[i][left];
                given[i][left]=given[i][right];
                given[i][right]=temp;

                left++;
                right--;

            }
        }

        return given;

    }



    public static void main(String[] args) {

        int[][] given={{1,2,3},
                       {4,5,6},
                       {7,8,9}};

       int[][]ans= solve(given);

       for(int[] an:ans){
           System.out.println(Arrays.toString(an));
       }


    }
}
