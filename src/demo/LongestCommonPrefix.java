package demo;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String solve(String[] words){

        StringBuilder ans=new StringBuilder();
        Arrays.sort(words);
        String first=words[0];
        String last=words[words.length-1];

        for(int i=0; i<Math.min(first.length(), last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();

    }


    public static String solve2(String[] words){

        if(words==null || words.length<1)
            return "";

       String prefix= words[0];

       for(int i=1;i<words.length;i++){

           if(words[i]==null){
               return "";
           }

           while(words[i].indexOf(prefix)!=0){
               prefix=prefix.substring(0,prefix.length()-1);

           }
       }

       return prefix;

    }




    static void main(String[] args) {


        String[] input = {"interview", "internet", "internal", "interval"};
        String result = solve2(input);
        System.out.println("Longest Common Prefix: " + result);

    }
}
