package demo;

import java.util.LinkedHashMap;
import java.util.*;

public class FirstNonRepeatingCharacter {

    public static char solve(String given, int target){

        Map<Character,Integer> map=new LinkedHashMap<>();

        String pros=given.toLowerCase().replace(" ", "");

       char[] chars= pros.toCharArray();

       for(char ch:chars){
               map.put(ch, map.getOrDefault(ch,0)+1) ;

       }

       for(Map.Entry<Character,Integer>entry:map.entrySet()){

           if(entry.getValue()==target){
               return entry.getKey();
           }
       }

       return '\0';


    }


    public static void main(String[] args) {

        String str = " aAb   b Cdd e  ";

        char result = solve(str,2);
        System.out.println(result);    }

}
