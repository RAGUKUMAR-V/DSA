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


    public static void main(String[] args) {
        int[] array={1,2,3};
        List<int[]>ans=solve(array);
        for(int[] an:ans){
            System.out.println(Arrays.toString(an));
        }

    }
}