package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

   public static List<List<Integer>> solve(int[][] arr) {

       List<List<Integer>>list=new ArrayList<>();
       Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));

       for(int[] ar:arr){

           if(list.isEmpty() || list.get(list.size()-1).get(1) < ar[0]){

               list.add(Arrays.asList(ar[0], ar[1]));
           }

           else{

               int last=list.size()-1;
               int max=Math.max(ar[1], list.get(last).get(1));
               list.get(last).set(1,max);
           }
       }

      return list;

    }


    static void main(String[] args) {

        int[][] intervals = {

                {1, 3}, {2, 6}, {8, 15}, {10, 18}
        };

        List<List<Integer>>ans=solve(intervals);

        for (List<Integer>an:ans){
            System.out.print(an.toString());
        }


    }
}
