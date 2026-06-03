package demo;

import java.util.Arrays;
import java.util.*;

public class SubArraysForGivenArray {

    public static List<int[]> solve(int[] arr){
        List<int[]>list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                list.add(Arrays.copyOfRange(arr,i,j+1));
            }
        }
        return list;

    }

    public static List<List<Integer>> solve2(List<Integer> arr){
        List<List<Integer>>list=new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            for(int j=i;j< arr.size();j++){
                list.add(arr.subList(i,j+1));
            }
        }
        return list;

    }


    public static void main(String[] args) {
        int[] array={1,2,3};
        List<Integer>lis=Arrays.asList(1,2,3,4,5);
        List<int[]>ans=solve(array);
        List<List<Integer>>ans2=solve2(lis);

        for(int[] an:ans){
            System.out.print(Arrays.toString(an));
        }

        for(List<Integer> an:ans2){
            System.out.print((an));
        }

    }
}