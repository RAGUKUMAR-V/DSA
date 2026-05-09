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

    public static List<int[]> solve2(int[] arr, int tar){

        List<int[]> list=new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            int sum=0;
            for(int j=i;j<arr.length-1;j++){

                sum=sum+arr[j];
                if(sum==tar){
                    if(!list.isEmpty()){
                        int len1=list.get(0).length;
                        int len2=Arrays.copyOfRange(arr, i,j+1).length;
                        if(len1<len2){
                            list.clear();
                            list.add(Arrays.copyOfRange(arr, i,j+1));
                        }

                    }else{
                        list.add(Arrays.copyOfRange(arr, i,j+1));
                    }
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


        List<int[]>ans1=solve2(array,target);
        for(int[]an1:ans1){
            System.out.println(Arrays.toString(an1));
        }


    }
}
