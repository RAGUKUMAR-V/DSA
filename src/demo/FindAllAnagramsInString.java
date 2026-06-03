package demo;

import java.util.*;

public class FindAllAnagramsInString {


    public static List<Integer> solve(String s, String p){

        List<Integer>list=new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        Map<Character,Integer>sMap=new HashMap<>();
        Map<Character,Integer>pMap=new HashMap<>();

        for(char ch:p.toCharArray()){
            pMap.put(ch, pMap.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<p.length();i++){
            char ch=s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch,0)+1);
        }

        if (sMap.equals(pMap)) {
            list.add(0);
        }


        for(int right=p.length();right<s.length();right++){
            char addchar=s.charAt(right);
            sMap.put(addchar,sMap.getOrDefault(addchar,0)+1);

            char remove=s.charAt(right-p.length());

            sMap.put(remove, sMap.get(remove)-1);

            if(sMap.get(remove)==0){
                sMap.remove(remove);
            }

            if(sMap.equals(pMap)){
                list.add(right-p.length()+1);
            }

        }

           return list;

    }

    public static void main(String[] args) {

        String s="cbaebabacd";
        String p="abc";
       List<Integer>ans=solve(s,p);

        System.out.println(ans);


    }
}
