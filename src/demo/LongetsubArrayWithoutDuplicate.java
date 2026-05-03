package demo;

import java.util.*;

public class LongetsubArrayWithoutDuplicate {

    public static String solve(String given){

        Set<Character>set=new HashSet<>();
        int left=0, maxlen=0, start=0;

        for(int right=0;right<given.length();right++){
          while(set.contains(given.charAt(right))){
              set.remove(given.charAt(left));
              left++;

          }
          set.add((given.charAt(right)));
          if(right-left+1>maxlen){
              maxlen=right-left+1;
              start=left;
          }
        }

        return given.substring(start,start+maxlen);


    }

    public static void main(String[] args) {

        String given="abcdeabcd";
        String ans=solve(given);
        System.out.println(ans);
    }


}
