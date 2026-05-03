package demo;
import java.util.*;

public class OccuranceOfString {


    public static void solve(String word){

        Map<Character,Integer>map=new HashMap<>();
        char[] cha=word.toCharArray();

        for(char ch:cha){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

       Set<Map.Entry<Character,Integer>>values=map.entrySet();
        for(Map.Entry<Character,Integer>entry :values){
           System.out.println(entry.getKey()+" :"+entry.getValue());
        }

       Set<Character> letters= map.keySet();

        for(char let:letters){
            System.out.println(let +":"+map.get(let));
        }


    }

    public static void main(String[] args) {

        String given="ragukumar";

        solve(given);

    }
}
