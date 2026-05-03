package demo;

import java.util.*;
public class SubArrayForGivenSum {

    public static List<int[]> solve(int[] arr, int target){

        List<int[]>list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==target){
                    list.add(Arrays.copyOfRange(arr,i,j+1));
                }

            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] array={0,1,0,0,0,0,1,1,2,3,5,0,0,0,0,0,0,2,0,0,2};
        int target=2;
        List<int[]> ans=solve(array,target);
        int maxlen=0;
        List<int[]>lis=new ArrayList<>();
        for(int[]an:ans){

            if(an.length>maxlen || an.length==maxlen){
                lis.clear();
                lis.add(an);
                maxlen=an.length;
            }

        }

        for(int[] ann:lis){
            System.out.println(Arrays.toString(ann) +"length is : "+maxlen);
        }


    }
}
