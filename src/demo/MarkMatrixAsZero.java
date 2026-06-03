package demo;

import java.util.Arrays;

public class MarkMatrixAsZero {

    public static int[][] solve(int[][] nums) {

       int m= nums.length;
       int n=nums[0].length;

       boolean[] rows=new boolean[m];
        boolean[] col=new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j]==0){
                    rows[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || col[j]){
                    nums[i][j]=0;
                }
            }
        }


return nums;

    }

    public static void main(String[] args) {

        int[][]s={{1,1,0},
                  {1,1,1},
                  {1,1,1}};
       int[][]ans= solve(s);
       for(int[] an:ans){
           System.out.println(Arrays.toString(an));
       }

    }
}
