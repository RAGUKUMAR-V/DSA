package demo;

import java.util.HashMap;
import java.util.*;

public class GroupAnagram {

    public static List<List<String>> solve(String[] list){

        Map<String, List<String>>map=new HashMap<>();

        for(String word:list){

            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);


        }

        return new ArrayList<>(map.values());

    }

    static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = solve(strs);

        System.out.println(result);


    }
}
