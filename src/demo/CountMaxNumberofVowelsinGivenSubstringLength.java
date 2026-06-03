package demo;

public class CountMaxNumberofVowelsinGivenSubstringLength {



    public static int solve(String s, int k){

        int count=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }

        int max=count;

        for(int right=k;right<s.length();right++){
            int left=right-k;
            if(isVowel(s.charAt(left))){
                count--;
            }

            if(isVowel(s.charAt(right))){
                count++;
            }

            max=Math.max(max,count);
        }

        return max;

    }

    public static boolean isVowel(char ch){

        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u');

    }

    public static void main(String[] args) {

        String s="abcidefa";
        int ans= solve(s,5);
        System.out.println(ans);
    }


}
