package demo;

public class PermutationOfString {

    public static boolean solve(String s1, String s2){

        if(s1.length()>s2.length()){
            return false;
        }

        int[] s1freq=new int[26];
        int[] s2freq=new int[26];

        for(char ch:s1.toCharArray()){
            s1freq[ch-'a']++;
        }

        int k=s1.length();

        for(int i=0;i<k;i++){
            s2freq[s2.charAt(i)-'a']++;
        }

        if(match(s1freq,s2freq)){
            return true;
        }

        for(int i=k;i<s2.length();i++){

            s2freq[s2.charAt(i)-'a']++;

            s2freq[s2.charAt(i-k)-'a']--;

            if(match(s1freq,s2freq)){
                return true;
            }

        }

      return false;


    }

    public static boolean match(int[] s1,int[] s2){

        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
       return true;
    }

    public static void main(String[] args) {

        String s1="abde";
        String s2="eidbaooo";

        System.out.println(solve(s1,s2));
    }

}
